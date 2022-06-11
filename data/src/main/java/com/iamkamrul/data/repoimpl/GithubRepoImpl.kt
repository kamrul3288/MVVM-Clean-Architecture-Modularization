package com.iamkamrul.data.repoimpl

import com.iamkamrul.data.apiservice.ApiService
import com.iamkamrul.data.apiservice.NetworkBoundResources
import com.iamkamrul.data.mapper.RepositoryListItemMapper
import com.iamkamrul.data.mapper.UserProfileMapper
import com.iamkamrul.data.mapper.mapFromApiResponse
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.repository.GithubRepository
import com.iamkamrul.domain.usecase.RepositoryListUseCase
import com.iamkamrul.domain.usecase.UserProfileUseCase
import com.iamkamrul.entity.RepositoryListItemEntity
import com.iamkamrul.entity.UserProfileEntity
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResources,
    private val repositoryListItemMapper: RepositoryListItemMapper,
    private val userProfileMapper: UserProfileMapper
) : GithubRepository{

    override suspend fun fetchOwnerRepositoryList(params: RepositoryListUseCase.Params): Result<List<RepositoryListItemEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchOwnerRepositoryList(params.userName)
            },repositoryListItemMapper
        )
    }

    override suspend fun fetchOwnerProfile(params: UserProfileUseCase.Params): Result<UserProfileEntity> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchUser(params.userName)
            },userProfileMapper
        )
    }


}