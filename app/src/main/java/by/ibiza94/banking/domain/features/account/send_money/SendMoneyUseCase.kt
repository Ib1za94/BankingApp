package by.ibiza94.banking.domain.features.account.send_money

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.domain.features.transactions.TransactionRepository
import by.ibiza94.banking.domain.features.transactions.model.TransactionRowPayload
import by.ibiza94.banking.domain.features.transactions.model.TransactionType

class SendMoneyUseCase(
    private val transactionRepository: TransactionRepository
) {
    suspend fun execute(
        amount: MoneyAmount,
        fromCardId: String,
        contactId: Long,
    ) {
        return transactionRepository.submitTransaction(
            TransactionRowPayload(
                type = TransactionType.SEND,
                amount = amount,
                cardId = fromCardId,
                contactId = contactId
            )
        )
    }
}