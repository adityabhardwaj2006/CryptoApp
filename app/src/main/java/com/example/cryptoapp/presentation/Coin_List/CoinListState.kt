package com.example.cryptoapp.presentation.Coin_List

import com.example.cryptoapp.domain.Models.Coin

data class CoinListState(
    var isLoading: Boolean = false,
    var error : String = "",
    var list : List<Coin> = emptyList()
)
