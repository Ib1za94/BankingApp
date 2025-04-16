package by.ibiza94.banking.ui.feature_login

sealed class LoginIntent {
    object EnterScreen : LoginIntent()

    data class LoginFieldChanged(
        val fieldType: LoginFieldType,
        val fieldValue: String
    ): LoginIntent()

    object SubmitForm : LoginIntent()
}