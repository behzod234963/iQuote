package com.coder.behzod.iquotes.di

import android.content.Context
import android.view.View
import com.coder.behzod.iquotes.view.MainView
import com.coder.behzod.iquotes.view.MainViewImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule{
    @Singleton
    @Provides
    fun provideMainViewImpl(): MainView = MainViewImpl()
}