package by.ibiza94.banking.ui.feature_signup.confirm_signup

import by.ibiza94.banking.domain.features.otp.model.OtpConfiguration
import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_otp.OtpConfirmationState

data class ConfirmSignUpScreenState(
    val isInitialLoading: Boolean = true,
    val otpConfiguration: OtpConfiguration? = null,
    val otpState: OtpConfirmationState? = null,
    val screenError: UiText? = null,
)