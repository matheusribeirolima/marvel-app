package com.marvel.app.network.model

import com.google.gson.annotations.SerializedName
import com.marvel.app.network.base.Entity
import java.util.*

data class Character(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("modified") val modified: Date,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("urls") val urls: List<Url>,
    @SerializedName("thumbnail") val thumbnail: Image,
    @SerializedName("comics") val comics: TypeList,
    @SerializedName("stories") val stories: TypeList,
    @SerializedName("events") val events: TypeList,
    @SerializedName("series") val series: TypeList
) : Entity
