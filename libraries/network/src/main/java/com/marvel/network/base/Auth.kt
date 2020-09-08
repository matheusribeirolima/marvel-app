package com.marvel.network.base

import java.math.BigInteger
import java.security.MessageDigest

private const val SIG_NUM = 1
private const val RADIX = 16
private const val LENGTH = 32

class Auth(
    val timeStamp: String,
    val publicKey: String,
    private val privateKey: String,
    private val messageDigest: MessageDigest = MessageDigest.getInstance("MD5")
) {

    fun generateMd5Hash(): String {
        val input = timeStamp + privateKey + publicKey
        return BigInteger(
            SIG_NUM,
            messageDigest.digest(input.toByteArray())
        ).toString(RADIX).padStart(LENGTH, '0')
    }
}
