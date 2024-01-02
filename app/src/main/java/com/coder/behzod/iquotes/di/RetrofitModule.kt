package com.coder.behzod.quotesapp.di

import com.coder.behzod.quotesapp.model.database.remote.RetrofitClient.IS_TESTER
import com.coder.behzod.quotesapp.model.database.remote.RetrofitClient.SERVER_DEVELOPMENT
import com.coder.behzod.quotesapp.model.database.remote.RetrofitClient.SERVER_PRODUCTION
import com.coder.behzod.quotesapp.model.database.remote.RetrofitService
import com.coder.behzod.quotesapp.model.model.QuotesItem
import com.coder.behzod.quotesapp.presenter.main.MainPresenter
import com.coder.behzod.quotesapp.presenter.main.MainPresenterImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {
    @Provides
    @Singleton
    fun provideNetworkServer():String{
        if (IS_TESTER) return SERVER_DEVELOPMENT else SERVER_PRODUCTION
        return SERVER_DEVELOPMENT
    }
    @Provides
    @Singleton
    fun provideRetrofitClient():Retrofit{
        return Retrofit
            .Builder()
            .baseUrl(provideNetworkServer())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun provideRetrofitService():RetrofitService{
        return provideRetrofitClient().create(RetrofitService::class.java)
    }
}