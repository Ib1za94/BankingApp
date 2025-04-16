package by.ibiza94.banking.domain.features.transactions

import by.ibiza94.banking.domain.features.transactions.model.TransactionStatus
import kotlinx.coroutines.flow.Flow

class ObserveTransactionStatusUseCase(
    private val transactionRepository: TransactionRepository
) {
    fun execute(transactionId: Long): Flow<TransactionStatus> {
        return transactionRepository.getTransactionStatusFlow(transactionId)
    }
}