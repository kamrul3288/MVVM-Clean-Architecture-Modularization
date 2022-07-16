package com.iamkamrul.domain.usecase

import com.iamkamrul.domain.base.ApiUseCase
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.repository.GithubRepository
import com.iamkamrul.entity.RepositoryListItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryListUseCase @Inject constructor(
    private val repository: GithubRepository
):ApiUseCase<RepositoryListUseCase.Params,List<RepositoryListItemEntity>>{
    override suspend fun execute(params: Params): Flow<Result<List<RepositoryListItemEntity>>> {
        return repository.fetchOwnerRepositoryList(params)
    }
    data class Params(val userName:String)
}