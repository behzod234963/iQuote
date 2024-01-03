package com.coder.behzod.iquotes.di

import com.coder.behzod.iquotes.view.main.MainView
import com.coder.behzod.iquotes.view.main.MainViewImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ViewModule {

    @Singleton
    @Provides
    fun provideMainView(): MainView = MainViewImpl()
}