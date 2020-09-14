package com.marvel.app.network.model

import com.google.gson.annotations.SerializedName
import com.marvel.app.network.base.Summary

data class TypeList(
    @SerializedName("available") val available: Int,
    @SerializedName("returned") val returned: Int,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("items") val items: List<Summary>
)
