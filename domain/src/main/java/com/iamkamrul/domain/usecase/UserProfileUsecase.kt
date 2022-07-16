package com.iamkamrul.domain.usecase

import com.iamkamrul.domain.base.ApiUseCase
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.repository.GithubRepository
import com.iamkamrul.entity.UserProfileEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserProfileUseCase @Inject constructor(
    private val repository: GithubRepository
):ApiUseCase<UserProfileUseCase.Params,UserProfileEntity>{
    data class Params(val userName:String)
    override suspend fun execute(params: Params): Flow<Result<UserProfileEntity>> {
        return repository.fetchOwnerProfile(params)
    }
}