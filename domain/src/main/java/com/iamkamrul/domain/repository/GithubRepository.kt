package com.iamkamrul.domain.repository

import com.iamkamrul.domain.base.Result
import com.iamkamrul.entity.RepositoryListItemEntity

interface GithubRepository {
    suspend fun fetchOwnerRepositoryList(userName:String):Result<List<RepositoryListItemEntity>>
}