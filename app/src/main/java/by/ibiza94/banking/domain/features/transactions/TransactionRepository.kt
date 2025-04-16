package by.ibiza94.banking.domain.features.transactions

import androidx.paging.PagingData
import by.ibiza94.banking.domain.features.transactions.model.Transaction
import by.ibiza94.banking.domain.features.transactions.model.TransactionRowPayload
import by.ibiza94.banking.domain.features.transactions.model.TransactionStatus
import by.ibiza94.banking.domain.features.transactions.model.TransactionType
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getTransactions(filterByType: TransactionType?): Flow<PagingData<Transaction>>
    fun getTransactionStatusFlow(transactionId: Long): Flow<TransactionStatus>
    suspend fun submitTransaction(payload: TransactionRowPayload)
}