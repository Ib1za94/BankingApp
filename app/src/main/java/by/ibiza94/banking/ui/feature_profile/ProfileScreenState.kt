package by.ibiza94.banking.ui.feature_profile

import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_logout.LogoutState
import by.ibiza94.banking.ui.feature_profile.model.ProfileUi

data class ProfileScreenState(
    val profile: ProfileUi? = null,
    val isProfileLoading: Boolean = true,
    val error: UiText? = null,
    val logoutState: LogoutState = LogoutState(),
    val showMyQrDialog: Boolean = false,
    val showScanQrDialog: Boolean = false,
    val showPermissionDialog: Boolean = false
)

