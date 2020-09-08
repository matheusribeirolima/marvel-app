package com.marvel.network.model

import com.google.gson.annotations.SerializedName
import com.marvel.network.base.Entity

data class Wrapper(
    @SerializedName("code") val code: Int,
    @SerializedName("status") val message: String,
    @SerializedName("data") val data: Container,
    @SerializedName("etag") val etag: String,
    @SerializedName("copyright") val copyright: String,
    @SerializedName("attributionText") val attributionText: String,
    @SerializedName("attributionHTML") val attributionHTML: String
)

data class Container(
    @SerializedName("offset") val offset: Int,
    @SerializedName("limit") val limit: Int,
    @SerializedName("total") val total: Int,
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: List<Entity>
)
