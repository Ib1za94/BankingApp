package by.ibiza94.banking.ui.feature_otp

import by.ibiza94.banking.domain.core.OperationResult
import by.ibiza94.banking.domain.features.otp.model.OtpGenerationResponse
import by.ibiza94.banking.domain.features.otp.model.OtpVerificationResponse
import by.ibiza94.banking.ui.feature_cards.screen_add_card.UiField
import de.palm.composestateevents.StateEventWithContent
import de.palm.composestateevents.consumed

data class OtpConfirmationState(
    val isLoading: Boolean = false,
    val codeLength: Int = 4,
    val code: UiField = UiField(""),
    val codeSentTo: String = "",
    val submitBtnEnabled: Boolean = false,
    val codeSubmittedEvent: StateEventWithContent<OperationResult<OtpVerificationResponse>> = consumed(),
    val codeResentEvent: StateEventWithContent<OperationResult<OtpGenerationResponse>> = consumed(),
)
