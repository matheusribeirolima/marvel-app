package com.marvel.app.di

import com.google.gson.Gson
import com.marvel.app.BuildConfig
import com.marvel.app.network.base.Auth
import com.marvel.app.network.di.gson
import com.marvel.app.network.di.httpClient
import com.marvel.app.network.di.loggingInterceptor
import com.marvel.app.network.di.marvelApi
import com.marvel.app.network.di.retrofit
import com.marvel.app.network.di.sessionInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Provides
    fun provideLoggingInterceptor() = loggingInterceptor(BuildConfig.DEBUG)

    @Provides
    // todo implement factory here
    fun provideAuth() = Auth(
        System.currentTimeMillis().toString(),
        BuildConfig.PUBLIC_KEY,
        BuildConfig.PRIVATE_KEY
    )

    @Provides
    fun provideSessionInterceptor(auth: Auth) = sessionInterceptor(auth)

    @Provides
    fun provideHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        sessionInterceptor: Interceptor
    ) = httpClient(loggingInterceptor, sessionInterceptor)

    @Provides
    fun provideGson() = gson()

    @Provides
    fun provideRetrofit(httpClient: OkHttpClient, gson: Gson) = retrofit(httpClient, gson)

    @Provides
    fun provideMarvelApi(retrofit: Retrofit) = marvelApi(retrofit)
}
