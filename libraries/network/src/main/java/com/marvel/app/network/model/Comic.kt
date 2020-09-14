package com.marvel.app.network.model

import com.google.gson.annotations.SerializedName
import com.marvel.app.network.base.Entity
import com.marvel.app.network.base.Summary
import java.util.*

data class Comic(
    @SerializedName("id") val id: Int,
    @SerializedName("digitalId") val digitalId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("issueNumber") val issueNumber: Double,
    @SerializedName("variantDescription") val variantDescription: String,
    @SerializedName("description") val description: String,
    @SerializedName("modified") val modified: Date,
    @SerializedName("isbn") val isbn: String,
    @SerializedName("upc") val upc: String,
    @SerializedName("diamondCode") val diamondCode: String,
    @SerializedName("ean") val ean: String,
    @SerializedName("issn") val issn: String,
    @SerializedName("format") val format: String,
    @SerializedName("pageCount") val pageCount: Int,
    @SerializedName("textObjects") val textObjects: List<TextObject>,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("urls") val urls: List<Url>,
    @SerializedName("series") val series: Summary,
    @SerializedName("variants") val variants: List<Summary>,
    @SerializedName("collections") val collections: List<Summary>,
    @SerializedName("collectedIssues") val collectedIssues: List<Summary>,
    @SerializedName("dates") val dates: List<ComicDate>,
    @SerializedName("prices") val prices: List<ComicPrice>,
    @SerializedName("thumbnail") val thumbnail: Image,
    @SerializedName("images") val images: List<Image>,
    @SerializedName("creators") val creators: TypeList,
    @SerializedName("characters") val characters: TypeList,
    @SerializedName("stories") val stories: TypeList,
    @SerializedName("events") val events: TypeList,
) : Entity
