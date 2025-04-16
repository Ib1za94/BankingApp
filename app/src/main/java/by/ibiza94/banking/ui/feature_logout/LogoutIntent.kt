package by.ibiza94.banking.ui.feature_logout

sealed class LogoutIntent {
    data class ToggleLogoutDialog(val isShown: Boolean): LogoutIntent()

    object ConfirmLogOut: LogoutIntent()
}
