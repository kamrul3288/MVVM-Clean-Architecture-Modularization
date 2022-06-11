package com.iamkamrul.entity

data class UserProfileEntity(
    val userAvatar:String,
    val userFullName:String,
    val userName:String,
    val about:String,
    val repoCount:Int,
    val followerCount:Int,
    val followingCount:Int,
)
