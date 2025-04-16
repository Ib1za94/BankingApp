package by.ibiza94.banking.domain.features.account.account_topup

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.domain.features.transactions.TransactionRepository
import by.ibiza94.banking.domain.features.transactions.model.TransactionRowPayload
import by.ibiza94.banking.domain.features.transactions.model.TransactionType

class TopUpAccountUseCase(
    private val transactionRepository: TransactionRepository,
) {
    suspend fun execute(cardId: String, amount: MoneyAmount) {
        return transactionRepository.submitTransaction(
            TransactionRowPayload(
                type = TransactionType.TOP_UP,
                amount = amount,
                contactId = null,
                cardId = cardId
            )
        )
    }
}