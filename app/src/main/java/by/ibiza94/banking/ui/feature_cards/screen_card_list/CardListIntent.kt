package by.ibiza94.banking.ui.feature_cards.screen_card_list

sealed class CardListIntent {
    object EnterScreen: CardListIntent()
    data class ToggleFloatingAddCardButton(val isShown: Boolean): CardListIntent()
}
