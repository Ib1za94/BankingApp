package by.ibiza94.banking.ui.feature_cards.dialog_card_picker

import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_cards.model.CardUi

data class CardPickerState(
    val isLoading: Boolean = false,
    val cards: List<CardUi>? = null,
    val selectedCardId: String? = null,
    val error: UiText? = null,
)
