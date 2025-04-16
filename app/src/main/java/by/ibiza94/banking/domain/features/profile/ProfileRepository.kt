package by.ibiza94.banking.domain.features.profile

import by.ibiza94.banking.domain.features.profile.model.CompactProfile

interface ProfileRepository {
    suspend fun getCompactProfile(): CompactProfile
}