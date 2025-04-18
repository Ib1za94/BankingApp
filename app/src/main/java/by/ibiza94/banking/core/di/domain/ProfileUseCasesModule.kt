package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.profile.GetCompactProfileUseCase
import org.koin.dsl.module

val profileUseCasesModule = module {
    factory {  GetCompactProfileUseCase(profileRepository = get()) }
}