package com.iamkamrul.data.mapper

import com.iamkamrul.apiresponse.RepositoryListItemApiResponse
import com.iamkamrul.entity.RepositoryListItemEntity
import javax.inject.Inject

class RepositoryListItemMapper @Inject constructor():Mapper<List<RepositoryListItemApiResponse>,List<RepositoryListItemEntity>>{


    override fun mapFromApiResponse(type: List<RepositoryListItemApiResponse>): List<RepositoryListItemEntity> {
        return type.map {
            RepositoryListItemEntity(
                userAvatarUrl = it.owner?.avatar_url ?: "https://www.pullrequest.com/blog/github-code-review-service/images/github-logo_hub2899c31b6ca7aed8d6a218f0e752fe4_46649_1200x1200_fill_box_center_2.png",
                userName = it.owner?.login ?: "NO_USER_NAME_FOUND",
                repoName = it.name ?: "EMPTY_REPO_NAME",
                repoFullName = it.full_name ?: "EMPTY_REPO_NAME",
                repoDescription = it.description ?: "No description found",
                language = it.language ?: "Not Found",
                forksCount = it.forks_count ?: 0,
                stargazers_count = it.stargazers_count ?: 0
            )
        }
    }

}