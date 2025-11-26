package com.br.gamedatabase

import com.br.gamedatabase.data.network.ApiKeyInterceptor
import com.br.gamedatabase.data.repository.GameRepository
import com.br.gamedatabase.data.repository.GameRepositoryImpl
import com.br.gamedatabase.ui.game.GameListViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        OkHttpClient.Builder()
            .addInterceptor(get<HttpLoggingInterceptor>())
            .addInterceptor(ApiKeyInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.rawg.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(get<OkHttpClient>())
            .build()
    }

    single {
        get<Retrofit>().create(GameRepository::class.java)
    }

}

val repositoryModule = module {
    singleOf(::GameRepositoryImpl)
}

val viewModelModule = module {
    viewModelOf(::GameListViewModel)
}