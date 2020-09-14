package com.marvel.app.di

import android.content.Context
import com.marvel.app.core.helper.ResourceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun provideResourceManager(@ApplicationContext context: Context) = ResourceManager(context)
}
