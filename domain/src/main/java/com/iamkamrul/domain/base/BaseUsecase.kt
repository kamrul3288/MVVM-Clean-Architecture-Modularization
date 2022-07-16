package com.iamkamrul.domain.base

import kotlinx.coroutines.flow.Flow

interface BaseUseCase
interface ApiUseCase<Params,Type>:BaseUseCase{
    suspend fun execute(params: Params):Flow<Result<Type>>
}
