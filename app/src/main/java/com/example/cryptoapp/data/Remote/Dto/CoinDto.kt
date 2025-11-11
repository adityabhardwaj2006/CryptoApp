package com.example.cryptoapp.data.Remote.Dto

import com.example.cryptoapp.domain.Models.Coin
import kotlin.String

data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
fun CoinDto.toCoin(): Coin {
    return Coin(
     id = id,
     is_active = is_active,
     name = name,
     rank = rank,
     symbol = symbol,

    )
}