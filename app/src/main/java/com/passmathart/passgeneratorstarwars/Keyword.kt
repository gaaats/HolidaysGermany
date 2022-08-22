package com.passmathart.passgeneratorstarwars


import com.google.gson.annotations.SerializedName

data class Keyword(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)