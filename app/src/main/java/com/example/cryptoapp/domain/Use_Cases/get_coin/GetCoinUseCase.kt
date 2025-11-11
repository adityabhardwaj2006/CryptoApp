package com.example.cryptoapp.domain.Use_Cases.get_coin

import com.example.cryptoapp.Common.Resource
import com.example.cryptoapp.data.Remote.Dto.toCoin
import com.example.cryptoapp.data.Remote.Dto.toCoinDetail
import com.example.cryptoapp.domain.Models.Coin
import com.example.cryptoapp.domain.Models.CoinDetail
import com.example.cryptoapp.domain.Repository.Repo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository : Repo
) {

    operator fun invoke(coinId : String) : Flow<Resource<CoinDetail>> = flow {

        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))

        }

        catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        }
        catch (e: IOException){
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }

}