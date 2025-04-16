package by.ibiza94.banking.domain.features.transactions.model

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.domain.features.contacts.Contact

data class Transaction(
    val id: Long,
    val type: TransactionType,
    val value: MoneyAmount,
    val linkedContact: Contact?,
    val recentStatus: TransactionStatus,
    val createdDate: Long,
    val updatedStatusDate: Long,
)
