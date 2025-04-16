package by.ibiza94.banking.domain.features.login

class CheckIfLoggedInUseCase(
    private val loginRepository: LoginRepository
) {
    suspend fun execute(): Boolean {
        return loginRepository.checkIfLoggedIn()
    }
}