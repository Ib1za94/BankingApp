package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.otp.RequestOtpGenerationUseCase
import org.koin.dsl.module

val otpUseCasesModule = module {
    factory { RequestOtpGenerationUseCase(
        otpRepository = get()
    ) }
}