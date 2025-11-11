package com.example.cryptoapp.presentation.Coin_Details

import com.example.cryptoapp.domain.Models.Coin
import com.example.cryptoapp.domain.Models.CoinDetail

data class CoinDetailState(
    var isLoading: Boolean = false,
    var error : String = "",
    var coin : CoinDetail? = null
)
