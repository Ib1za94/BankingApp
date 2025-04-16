package by.ibiza94.banking.ui.feature_otp

import by.ibiza94.banking.domain.features.otp.model.OtpOperationType
import by.ibiza94.banking.domain.features.otp.model.OtpType

sealed class OtpConfirmationIntent {
   data class RequestInitialOtp(
       val otpType: OtpType,
       val otpOperationType: OtpOperationType,
       val otpDestination: String,
   ): OtpConfirmationIntent()

    object SubmitCode: OtpConfirmationIntent()
    object ResendCode: OtpConfirmationIntent()
    data class CodeChanged(val code: String): OtpConfirmationIntent()
}
