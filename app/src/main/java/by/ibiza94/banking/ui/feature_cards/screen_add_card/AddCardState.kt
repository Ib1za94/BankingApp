package by.ibiza94.banking.ui.feature_cards.screen_add_card

import by.ibiza94.banking.data.cards.MockCardConstants
import by.ibiza94.banking.domain.core.OperationResult
import by.ibiza94.banking.ui.core.extensions.getFormattedDate
import de.palm.composestateevents.StateEventWithContent
import de.palm.composestateevents.consumed

data class AddCardState(
    val formFields: AddCardFormFields = AddCardFormFields(),
    val isLoading: Boolean = false,
    val showDatePicker: Boolean = false,
    val cardSavedEvent: StateEventWithContent<OperationResult<Unit>> = consumed()
) {
    companion object {
        fun mock(
            isLoading: Boolean = false,
            showDatePicker: Boolean = false
        ): AddCardState {
            // + 365 days
            val randomMockCard = MockCardConstants.randomCard()
            val mockExpiration = System.currentTimeMillis() + 31556926000L

            return  AddCardState(
                formFields = AddCardFormFields(
                    cardNumber = UiField(randomMockCard.first),
                    cardHolder = UiField("Alexander Michael"),
                    addressFirstLine = UiField("2890 Pangandaran Street"),
                    addressSecondLine = UiField(""),
                    cvvCode = UiField("123"),
                    expirationDateTimestamp =  mockExpiration,
                    expirationDate = UiField(mockExpiration.getFormattedDate("dd MMM yyyy"))
                ),
                isLoading = isLoading,
                showDatePicker = showDatePicker
            )
        }
    }
}
