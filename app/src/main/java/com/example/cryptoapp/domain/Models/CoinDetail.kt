package com.example.cryptoapp.domain.Models

import com.example.cryptoapp.data.Remote.Dto.Tag
import com.example.cryptoapp.data.Remote.Dto.Team

data class CoinDetail(
    val description: String,
    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<Team>,

    ){

}