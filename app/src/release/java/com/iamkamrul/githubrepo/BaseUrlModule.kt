package com.iamkamrul.githubrepo

import com.iamkamrul.di.qualifier.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class BaseUrlModule {
    @Provides
    @BaseUrl
    fun provideBaseUrl():String = "https://api.github.com/"
}