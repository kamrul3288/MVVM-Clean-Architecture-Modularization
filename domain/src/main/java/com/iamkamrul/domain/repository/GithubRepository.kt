package com.iamkamrul.domain.repository

import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.usecase.RepositoryListUseCase
import com.iamkamrul.domain.usecase.UserProfileUseCase
import com.iamkamrul.entity.RepositoryListItemEntity
import com.iamkamrul.entity.UserProfileEntity
import kotlinx.coroutines.flow.Flow

interface GithubRepository {
    suspend fun fetchOwnerRepositoryList(params: RepositoryListUseCase.Params):Flow<Result<List<RepositoryListItemEntity>>>
    suspend fun fetchOwnerProfile(params: UserProfileUseCase.Params):Flow<Result<UserProfileEntity>>
}