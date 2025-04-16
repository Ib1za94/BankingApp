package by.ibiza94.banking.ui.feature_account

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import by.ibiza94.banking.ui.core.resources.UiText

data class AmountPickersState(
    val selectedAmount: MoneyAmount = MoneyAmount(0F),
    val maxAmount: MoneyAmount? = null,
    val proposedValues: Set<MoneyAmount> = emptySet(),
    val pickersEnabled: Boolean = true,
    val error: UiText? = null
)
