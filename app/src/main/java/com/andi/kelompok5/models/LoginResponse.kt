package com.andi.kelompok5.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("message") val message : String,
    @SerializedName("status") val status : Boolean,
    @SerializedName("data") val data : User?
)