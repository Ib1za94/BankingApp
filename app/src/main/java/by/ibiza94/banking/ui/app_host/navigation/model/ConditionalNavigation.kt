package by.ibiza94.banking.ui.app_host.navigation.model

data class ConditionalNavigation(
    val requireLogin: Boolean,
    val requireOnboarding: Boolean,
    val requireCreateAppLock: Boolean,
)
