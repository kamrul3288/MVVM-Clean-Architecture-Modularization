package com.iamkamrul.data.apiservice

import com.iamkamrul.apiresponse.RepositoryItemDetailsApiResponse
import com.iamkamrul.apiresponse.UserProfileApiResponse
import com.iamkamrul.apiresponse.RepositoryListItemApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/users/{username}/repos")
    suspend fun fetchOwnerRepositoryList(
        @Path("username")username:String
    ):Response<List<RepositoryListItemApiResponse>>

    @GET("/repos/{ownerName}/{repoName}")
    suspend fun fetchOwnerRepository(
        @Path("ownerName")ownerName:String,
        @Path("repoName")repoName:String
    ):Response<RepositoryItemDetailsApiResponse>

    @GET("/users/{username}")
    suspend fun fetchUser(
        @Path("username")username:String
    ):Response<UserProfileApiResponse>

}