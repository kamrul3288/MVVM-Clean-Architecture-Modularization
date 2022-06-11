package com.iamkamrul.data.mapper

import com.iamkamrul.domain.base.Result

// R means apiResponse type and E means entity
interface Mapper<R,E>{
    fun mapFromApiResponse(type:R):E
}
fun<R,E> mapFromApiResponse(result: Result<R>, mapper: Mapper<R, E>):Result<E>{
    return when(result){
        is Result.Success-> Result.Success(mapper.mapFromApiResponse(result.data))
        is Result.Error->Result.Error(result.message,result.code)
    }
}