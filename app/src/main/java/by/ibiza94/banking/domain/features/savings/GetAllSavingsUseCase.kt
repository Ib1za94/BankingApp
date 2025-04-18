package by.ibiza94.banking.domain.features.savings

import by.ibiza94.banking.domain.features.savings.model.Saving

class GetAllSavingsUseCase(
    private val savingsRepository: SavingsRepository
) {
    suspend fun execute(): List<Saving> {
        return savingsRepository.getSavings().sortedByDescending {
            it.completedPercentage
        }
    }
}