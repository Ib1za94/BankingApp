package by.ibiza94.banking.ui.feature_savings.screen_saving_details

import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_cards.model.CardUi
import by.ibiza94.banking.ui.feature_savings.model.SavingUi

sealed class SavingDetailsState {
    data class Success(
        val saving: SavingUi,
        val isCardLoading: Boolean = true,
        val linkedCard: CardUi? = null,
    ) : SavingDetailsState()

    data class Error(val error: UiText) : SavingDetailsState()

    object Loading : SavingDetailsState()
}