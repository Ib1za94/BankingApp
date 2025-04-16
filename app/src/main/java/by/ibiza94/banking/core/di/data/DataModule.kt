package by.ibiza94.banking.core.di.data

import androidx.room.Room
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import by.ibiza94.banking.data.account.AccountRepositoryMock
import by.ibiza94.banking.data.app.AppRepositoryImpl
import by.ibiza94.banking.data.app.AppSettignsRepository
import by.ibiza94.banking.data.app_lock.AppLockRepositoryImpl
import by.ibiza94.banking.data.cards.CardsRepositoryMock
import by.ibiza94.banking.data.contacts.ContactsRepositoryMock
import by.ibiza94.banking.data.db.CacheDatabase
import by.ibiza94.banking.data.db.convertors.MoneyAmountConvertor
import by.ibiza94.banking.data.login.LoginRepositoryMock
import by.ibiza94.banking.data.otp.OtpRepositoryMock
import by.ibiza94.banking.data.profile.ProfileRepositoryMock
import by.ibiza94.banking.data.savings.SavingsRepositoryMock
import by.ibiza94.banking.data.signup.SignUpRepositoryMock
import by.ibiza94.banking.data.transactions.TransactionRepositoryMock
import by.ibiza94.banking.domain.features.account.AccountRepository
import by.ibiza94.banking.domain.features.app_lock.AppLockRepository
import by.ibiza94.banking.domain.features.cards.CardsRepository
import by.ibiza94.banking.domain.features.contacts.ContactsRepository
import by.ibiza94.banking.domain.features.login.LoginRepository
import by.ibiza94.banking.domain.features.otp.OtpRepository
import by.ibiza94.banking.domain.features.profile.ProfileRepository
import by.ibiza94.banking.domain.features.savings.SavingsRepository
import by.ibiza94.banking.domain.features.signup.SignUpRepository
import by.ibiza94.banking.domain.features.transactions.TransactionRepository
import com.cioccarellia.ksprefs.KsPrefs
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.core.qualifier.named
import org.koin.dsl.module


val dataModule = module {
    single {
        Room.databaseBuilder(
            androidApplication().applicationContext,
            CacheDatabase::class.java,
            "cache.db"
        )
            .fallbackToDestructiveMigration()
            .addTypeConverter(MoneyAmountConvertor())
            .build()
    }

    single {
        val db: CacheDatabase = get()
        db.getCardsDao()
    }

    single {
        val db: CacheDatabase = get()
        db.getTransactionsDao()
    }

    single<AppSettignsRepository> {
        AppRepositoryImpl(get())
    }

    single<SignUpRepository> {
        SignUpRepositoryMock(
            coroutineDispatcher = Dispatchers.IO,
            otpRepository = get(),
            prefs = get()
        )
    }

    single<LoginRepository> {
        LoginRepositoryMock(
            coroutineDispatcher = Dispatchers.IO,
            prefs = get(),
            securedPrefs = get(named("encryptedPrefs"))
        )
    }

    single<ProfileRepository> {
        ProfileRepositoryMock(dispatcher = Dispatchers.IO)
    }

    single<CardsRepository> {
        CardsRepositoryMock(
            cardsDao = get(),
            coroutineDispatcher = Dispatchers.IO
        )
    }

    single<SavingsRepository> {
        SavingsRepositoryMock(
            coroutineDispatcher = Dispatchers.IO,
            context = androidApplication().applicationContext,
            cardsRepository = get()
        )
    }

    single<OtpRepository> {
        OtpRepositoryMock(
            coroutineDispatcher = Dispatchers.IO
        )
    }

    single {
        KsPrefs(androidApplication().applicationContext)
    }

    single(named("encryptedPrefs")) {
        val context = androidApplication().applicationContext

        val masterKey: MasterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        EncryptedSharedPreferences.create(
            context,
            "secured_shared_prefs",
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    single<AppLockRepository> {
        AppLockRepositoryImpl(
            securedPreferences = get(named("encryptedPrefs")),
            context = androidApplication().applicationContext
        )
    }

    single<AccountRepository> {
        AccountRepositoryMock(
            coroutineDispatcher = Dispatchers.IO,
            cardsDao = get(),
        )
    }

    single<TransactionRepository> {
        TransactionRepositoryMock(
            workManager = get(),
            contactsRepository = get(),
            transactionDao = get(),
            coroutineDispatcher = Dispatchers.IO
        )
    }

    single<ContactsRepository> {
        ContactsRepositoryMock()
    }
}