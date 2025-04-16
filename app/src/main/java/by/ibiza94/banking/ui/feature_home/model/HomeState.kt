package by.ibiza94.banking.ui.feature_home.model

import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_account.MoneyAmountUi
import by.ibiza94.banking.ui.feature_cards.model.CardUi
import by.ibiza94.banking.ui.feature_profile.model.ProfileUi
import by.ibiza94.banking.ui.feature_savings.model.SavingUi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

sealed class HomeState {
    // Single loading for all parts of screen for simplicity
    object Loading: HomeState()

    data class Success(
        val profile: ProfileUi,
        val cards: List<CardUi> = emptyList(),
        val savings: List<SavingUi> = emptyList(),
        val balance: Flow<MoneyAmountUi?> = flowOf(null),
    ): HomeState()

    data class Error(val error: UiText): HomeState()
}
