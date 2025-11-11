package com.example.cryptoapp.domain.Repository

import com.example.cryptoapp.data.Remote.Dto.CoinDetailDto
import com.example.cryptoapp.data.Remote.Dto.CoinDto

interface Repo {

    suspend fun getCoins() : List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
    
}