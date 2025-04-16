package by.ibiza94.banking.domain.features.app_lock

import by.ibiza94.banking.domain.features.app_lock.model.AuthenticationResult

class AuthenticateWithPinUseCase(
    private val appLockRepository: AppLockRepository
) {
    fun execute(pin: String): AuthenticationResult {
        return appLockRepository.authenticateWithPin(pin)
    }
}