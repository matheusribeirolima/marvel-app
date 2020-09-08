package com.marvel.network.base

import java.math.BigInteger
import java.security.MessageDigest

class Auth(
    val timeStamp: String,
    val publicKey: String,
    private val privateKey: String,
    private val messageDigest: MessageDigest = MessageDigest.getInstance("MD5")
) {

    fun generateMd5Hash(): String {
        val input = timeStamp + privateKey + publicKey
        return BigInteger(
            1,
            messageDigest.digest(input.toByteArray())
        ).toString(16).padStart(32, '0')
    }
}
