package com.br.gamedatabase.data

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("id")
    val Id: Int,
    @SerializedName("name")
    val Name: String
)