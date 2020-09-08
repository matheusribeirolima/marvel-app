package com.marvel.network.di

import com.marvel.network.base.Auth
import com.marvel.network.base.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun loggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
    return if (isDebug) {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    } else {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.NONE
        }
    }
}

fun sessionInterceptor(auth: Auth) = Interceptor { chain ->
    val url = chain.request().url.newBuilder()
        .addQueryParameter("ts", auth.timeStamp)
        .addQueryParameter("apikey", auth.publicKey)
        .addQueryParameter("hash", auth.generateMd5Hash())
        .build()

    val request = chain.request()
        .newBuilder()
        .url(url)
        .build()

    chain.proceed(request)
}

fun httpClient(
    loggingInterceptor: HttpLoggingInterceptor,
    sessionInterceptor: Interceptor,
    timeout: Long = 10L
): OkHttpClient =
    OkHttpClient.Builder()
        .connectTimeout(timeout, TimeUnit.SECONDS)
        .readTimeout(timeout, TimeUnit.SECONDS)
        .writeTimeout(timeout, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .addInterceptor(sessionInterceptor)
        .build()

fun retrofitClient(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
