package by.ibiza94.banking.data.app

interface AppSettignsRepository {
    fun setOnboardingPassed(viewed: Boolean)

    fun isOnboardingPassed(): Boolean

    fun isAppPermissionAlreadyAsked(permission: String): Boolean

    fun setPermissionAsked(permission: String, isAsked: Boolean = true)
}