package com.marvel.app.network.base

import com.marvel.app.network.base.Auth
import org.junit.Assert.assertEquals
import org.junit.Test

class AuthTest {

    @Test
    fun `generateMd5Hash should generate MD5 hash from inputs`() {
        // Given
        val auth = Auth(timeStamp = "1", privateKey = "privateKey", publicKey = "publicKey")

        // When
        val result = auth.generateMd5Hash()

        // Then
        assertEquals("233247fdd1aa10ab8d3d2e10e58f9b9d", result)
    }
}
