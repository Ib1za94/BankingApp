package by.ibiza94.banking.domain.features.onboarding

import by.ibiza94.banking.data.app.AppSettignsRepository

class CheckIfPassedOnboardingUseCase(
    private val settignsRepository: AppSettignsRepository
) {
    fun execute(): Boolean {
        return settignsRepository.isOnboardingPassed()
    }
}