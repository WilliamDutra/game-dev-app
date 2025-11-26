package com.br.gamedatabase.data

import com.google.gson.annotations.SerializedName

data class Game(
    @SerializedName("id")
    val Id: Int,
    @SerializedName("name")
    val Name: String,
    @SerializedName("slug")
    val Slug: String,
    @SerializedName("background_image")
    val BackgroundImage: String,
    @SerializedName("rating")
    val Rating: Float,
    @SerializedName("ratings_count")
    val Reviews: Float,
    @SerializedName("genres")
    val genres: List<Genre>
)

data class Genre(
    @SerializedName("id")
    val Id: Int,
    @SerializedName("Name")
    val Name: String
)