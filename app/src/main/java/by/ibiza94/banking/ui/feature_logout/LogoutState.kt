package by.ibiza94.banking.ui.feature_logout

import by.ibiza94.banking.domain.core.OperationResult
import de.palm.composestateevents.StateEventWithContent
import de.palm.composestateevents.consumed

data class LogoutState(
    val isLoading: Boolean = false,
    val showLogoutDialog: Boolean = false,
    val logoutEvent: StateEventWithContent<OperationResult<Unit>> = consumed(),
)