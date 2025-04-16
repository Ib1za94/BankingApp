package by.ibiza94.banking.domain.features.transactions.model

import by.ibiza94.banking.domain.features.account.model.MoneyAmount

data class TransactionRowPayload(
    val type: TransactionType,
    val amount: MoneyAmount,
    val cardId: String,
    val contactId: Long? = null,
)
