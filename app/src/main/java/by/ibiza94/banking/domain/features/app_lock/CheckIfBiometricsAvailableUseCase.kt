package by.ibiza94.banking.domain.features.app_lock

import by.ibiza94.banking.domain.features.app_lock.model.BiometricsAvailability

class CheckIfBiometricsAvailableUseCase(
    private val appLockRepository: AppLockRepository
) {
    fun execute(): BiometricsAvailability {
        return appLockRepository.checkBiometricsAvailable()
    }
}