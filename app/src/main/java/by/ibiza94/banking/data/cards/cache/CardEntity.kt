package by.ibiza94.banking.data.cards.cache

import androidx.room.Entity
import androidx.room.PrimaryKey
import by.ibiza94.banking.domain.features.cards.model.CardType

@Entity(tableName = "cards_cache")
data class CardEntity(
    @PrimaryKey(autoGenerate = false)
    val number: String,
    val isPrimary: Boolean,
    val cardType: CardType,
    val recentBalance: Float,
    val cardHolder: String,
    val expiration: Long,
    val addressFirstLine: String,
    val addressSecondLine: String,
    val addedDate: Long,
)
