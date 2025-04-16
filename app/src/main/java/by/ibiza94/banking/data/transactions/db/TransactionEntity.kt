package by.ibiza94.banking.data.transactions.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.domain.features.transactions.model.TransactionStatus
import by.ibiza94.banking.domain.features.transactions.model.TransactionType

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val type: TransactionType,
    val value: MoneyAmount,
    val recentStatus: TransactionStatus,
    val cardId: String,
    val linkedContactId: Long? = null,
    val createdDate: Long,
    val updatedStatusDate: Long,
)
