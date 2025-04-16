package by.ibiza94.banking.domain.features.login

class LoginWithEmailUseCase(
    private val loginRepository: LoginRepository
) {
    suspend fun execute(
        email: String,
        password: String
    ) {
        return loginRepository.loginWithEmail(email, password)
    }
}