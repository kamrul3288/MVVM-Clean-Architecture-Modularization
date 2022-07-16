package com.iamkamrul.data.mapper

import com.iamkamrul.domain.base.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// R means apiResponse type and E means entity
interface Mapper<R,E>{
    fun mapFromApiResponse(type:R):E
}
fun<R,E> mapFromApiResponse(result: Flow<Result<R>>, mapper: Mapper<R, E>):Flow<Result<E>>{
    return result.map {
        when(it){
            is Result.Success-> Result.Success(mapper.mapFromApiResponse(it.data))
            is Result.Error->Result.Error(it.message,it.code)
            is Result.Loading -> Result.Loading(it.loadingState)
        }
    }
}