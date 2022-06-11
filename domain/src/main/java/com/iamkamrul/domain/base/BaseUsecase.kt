package com.iamkamrul.domain.base

interface BaseUseCase
interface ApiUseCase<Params,Type>:BaseUseCase{
    suspend fun execute(params: Params? = null):Type
}
