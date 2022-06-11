package com.iamkamrul.data.apiservice

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

    @GET("/users/{username}")
    suspend fun fetchUser(
        @Path("username")username:String
    ):Response<UserProfileApiResponse>

}