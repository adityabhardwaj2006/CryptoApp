package com.example.cryptoapp.di

import com.example.cryptoapp.Common.Constants
import com.example.cryptoapp.data.Remote.CoinApi.CoinApi
import com.example.cryptoapp.data.Repository.Impl.repoImpl
import com.example.cryptoapp.domain.Repository.Repo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCoinPaprikaApi() : CoinApi{

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinApi::class.java)

    }
    @Provides
    @Singleton
    fun providesCoinRepo(api : CoinApi): Repo{
        return repoImpl(api)
    }

}