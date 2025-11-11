package com.example.cryptoapp.data.Repository.Impl

import com.example.cryptoapp.data.Remote.CoinApi.CoinApi
import com.example.cryptoapp.data.Remote.Dto.CoinDetailDto
import com.example.cryptoapp.data.Remote.Dto.CoinDto
import com.example.cryptoapp.domain.Repository.Repo
import jakarta.inject.Inject

class repoImpl @Inject constructor(
    private val api : CoinApi
): Repo {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)

    }
}