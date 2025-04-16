package by.ibiza94.banking.domain.features.savings

import by.ibiza94.banking.domain.features.savings.model.Saving

interface SavingsRepository {
    suspend fun getSavings(): List<Saving>
    suspend fun getSavingById(id: Long): Saving
}