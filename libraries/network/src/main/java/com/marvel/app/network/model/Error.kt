package com.marvel.app.network.model

import com.google.gson.annotations.SerializedName

data class Error(
    @SerializedName("code") val code: Int,
    @SerializedName("status") val status: String
)
