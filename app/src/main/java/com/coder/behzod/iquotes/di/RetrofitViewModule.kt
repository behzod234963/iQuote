package com.coder.behzod.iquotes.di

import com.coder.behzod.iquotes.view.retrofit.RetrofitView
import com.coder.behzod.iquotes.view.retrofit.RetrofitViewImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitViewModule {
    @Provides
    @Singleton
    fun provideRetrofitView():RetrofitView = RetrofitViewImpl()
}