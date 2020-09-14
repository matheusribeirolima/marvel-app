package com.marvel.app.network.model

import com.google.gson.annotations.SerializedName
import com.marvel.app.network.base.Summary

data class BaseSummary(
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("name") val name: String
) : Summary

data class TypeSummary(
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String
) : Summary

data class RoleSummary(
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("name") val name: String,
    @SerializedName("role") val role: String
) : Summary
