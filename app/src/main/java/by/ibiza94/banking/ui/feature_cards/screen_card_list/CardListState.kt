package by.ibiza94.banking.ui.feature_cards.screen_card_list

import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_cards.model.CardUi

data class CardListState(
    val isLoading: Boolean = true,
    val cards: List<CardUi> = emptyList(),
    val floatingAddCardShown: Boolean = false,
    val error: UiText? = null,
)
