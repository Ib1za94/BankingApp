package by.ibiza94.banking.domain.features.login

class LogoutUseCase(
    private val loginRepository: LoginRepository
) {
    suspend fun execute() {
        return loginRepository.logOut()
    }
}