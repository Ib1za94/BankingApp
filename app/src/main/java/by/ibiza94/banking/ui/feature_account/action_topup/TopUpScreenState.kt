package by.ibiza94.banking.ui.feature_account.action_topup

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_account.AmountPickersState
import by.ibiza94.banking.ui.feature_account.CardPickerState
import de.palm.composestateevents.StateEvent
import de.palm.composestateevents.consumed

data class TopUpScreenState(
    val cardPickerState: CardPickerState = CardPickerState(),
    val amountState: AmountPickersState = AmountPickersState(),
    val isLoading: Boolean = false,
    val error: UiText? = null,
    val topUpSubmittedEvent: StateEvent = consumed,
    val showSuccessDialog: Boolean = false,
    val requiredBackNavEvent: StateEvent = consumed
) {
    val proceedButtonEnabled
        get(): Boolean {
            return amountState.selectedAmount != MoneyAmount(0f) && cardPickerState.selectedCard != null
        }
}
