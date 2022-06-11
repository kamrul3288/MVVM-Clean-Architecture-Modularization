package com.iamkamrul.data.apiservice

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/users/{username}/repos")
    fun fetchOwnerRepositoryList(
        @Path("username")username:String
    ):Response<Nothing>

    @GET("/repos/{ownerName}/{repoName}")
    fun fetchOwnerRepository(
        @Path("ownerName")ownerName:String,
        @Path("repoName")repoName:String
    ):Response<Nothing>

    @GET("/users/{username}")
    fun fetchUser(
        @Path("username")username:String
    ):Response<Nothing>

}