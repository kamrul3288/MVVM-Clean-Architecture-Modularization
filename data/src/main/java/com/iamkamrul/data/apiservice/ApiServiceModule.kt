package com.iamkamrul.data.apiservice

import com.iamkamrul.di.qualifier.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiServiceModule {
    @Provides
    @Singleton
    fun provideApiService(@BaseUrl retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }

}