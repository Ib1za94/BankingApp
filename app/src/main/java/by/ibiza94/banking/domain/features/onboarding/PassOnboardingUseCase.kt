package by.ibiza94.banking.domain.features.onboarding

import by.ibiza94.banking.data.app.AppSettignsRepository

class PassOnboardingUseCase(
    private val settignsRepository: AppSettignsRepository
) {
    fun execute() {
        settignsRepository.setOnboardingPassed(viewed = true)
    }
}