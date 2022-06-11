package com.iamkamrul.data.repoimpl

import com.iamkamrul.apiresponse.RepositoryListItemApiResponse
import com.iamkamrul.data.apiservice.ApiService
import com.iamkamrul.data.apiservice.NetworkBoundResources
import com.iamkamrul.data.mapper.RepositoryListItemMapper
import com.iamkamrul.data.mapper.mapFromApiResponse
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.repository.GithubRepository
import com.iamkamrul.entity.RepositoryListItemEntity
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResources,
    private val repositoryListItemMapper: RepositoryListItemMapper
) : GithubRepository{


    override suspend fun fetchOwnerRepositoryList(userName: String): Result<List<RepositoryListItemEntity>> {
       return mapFromApiResponse(
           result = networkBoundResources.downloadData {
               apiService.fetchOwnerRepositoryList(userName)
           },repositoryListItemMapper
       )
    }



}