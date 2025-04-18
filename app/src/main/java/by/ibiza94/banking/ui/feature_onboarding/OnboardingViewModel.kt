package by.ibiza94.banking.ui.feature_onboarding

import androidx.lifecycle.ViewModel
import by.ibiza94.banking.domain.features.onboarding.PassOnboardingUseCase

class OnboardingViewModel(
    private val passOnboardingUseCase: PassOnboardingUseCase
): ViewModel() {

    fun emitIntent(onboardingIntent: OnboardingIntent) {
        when (onboardingIntent) {
            is OnboardingIntent.CompleteOnboarding -> {
                passOnboardingUseCase.execute()
            }
        }
    }
}