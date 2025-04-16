package by.ibiza94.banking.ui.feature_profile.menu

import by.ibiza94.banking.ui.core.resources.UiText

sealed class MenuItem {
    data class Item(
        val entry: MenuEntry,
        val onClick: (MenuEntry) -> Unit = {}
    ): MenuItem()

    data class Section(
        val title: UiText
    ): MenuItem()
}