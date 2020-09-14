package com.marvel.app.network.di

import com.marvel.app.network.base.Auth
import com.marvel.app.network.di.httpClient
import com.marvel.app.network.di.loggingInterceptor
import com.marvel.app.network.di.sessionInterceptor
import io.mockk.every
import io.mockk.mockk
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkModuleTest {

    @Test
    fun `loggingInterceptor when isDebug should intercept body level`() {
        // Given
        val isDebug = true

        // When
        val interceptor = loggingInterceptor(isDebug)

        // Then
        assertEquals(HttpLoggingInterceptor.Level.BODY, interceptor.level)
    }

    @Test
    fun `loggingInterceptor when isNotDebug should intercept none level`() {
        // Given
        val isDebug = false

        // When
        val interceptor = loggingInterceptor(isDebug)

        // Then
        assertEquals(HttpLoggingInterceptor.Level.NONE, interceptor.level)
    }

    @Test
    fun `sessionInterceptor should add query params`() {
        // Given
        val auth = mockk<Auth>()
        val chain = mockk<Interceptor.Chain>(relaxed = true)
        val queryParams = mutableListOf<String>()
        every { chain.request() } returns mockk(relaxed = true) {
            every { url } returns mockk(relaxed = true) {
                every { newBuilder() } returns mockk(relaxed = true) {
                    every { addQueryParameter(any(), capture(queryParams)) } returns this
                }
            }
        }
        val timeStamp = "timeStamp"
        val publicKey = "publicKey"
        val md5 = "md5"
        every { auth.timeStamp } returns timeStamp
        every { auth.publicKey } returns publicKey
        every { auth.generateMd5Hash() } returns md5

        // When
        sessionInterceptor(auth).intercept(chain)

        // Then
        assertEquals(queryParams[0], timeStamp)
        assertEquals(queryParams[1], publicKey)
        assertEquals(queryParams[2], md5)
    }

    @Test
    fun `httpClient should add interceptors and timeout`() {
        // Given
        val loggingInterceptor = mockk<HttpLoggingInterceptor>()
        val sessionInterceptor = mockk<Interceptor>()
        val timeout = 20L

        // When
        val result = httpClient(loggingInterceptor, sessionInterceptor, timeout)

        // Then
        assertEquals(timeout.toMillis(), result.connectTimeoutMillis)
        assertEquals(timeout.toMillis(), result.readTimeoutMillis)
        assertEquals(timeout.toMillis(), result.writeTimeoutMillis)
        assertEquals(loggingInterceptor, result.interceptors[0])
        assertEquals(sessionInterceptor, result.interceptors[1])
    }

    @Test
    fun `httpClient should set timeout default`() {
        // Given
        val loggingInterceptor = mockk<HttpLoggingInterceptor>()
        val sessionInterceptor = mockk<Interceptor>()
        val timeout = 10L

        // When
        val result = httpClient(loggingInterceptor, sessionInterceptor)

        // Then
        assertEquals(timeout.toMillis(), result.connectTimeoutMillis)
        assertEquals(timeout.toMillis(), result.readTimeoutMillis)
        assertEquals(timeout.toMillis(), result.writeTimeoutMillis)
    }
}

private fun Long.toMillis() = (this * 1000).toInt()
