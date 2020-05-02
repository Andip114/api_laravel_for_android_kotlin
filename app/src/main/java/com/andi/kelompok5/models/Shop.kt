package com.andi.kelompok5.models

import com.google.gson.annotations.SerializedName

data class Shop(
    @SerializedName("name") val name : String,
    @SerializedName("address") val address : String,
    @SerializedName("description") val desription : String
)