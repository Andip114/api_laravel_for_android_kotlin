package com.andi.kelompok5.api

import com.andi.kelompok5.models.DefaultResponse
import com.andi.kelompok5.models.LoginResponse
import com.andi.kelompok5.models.ShopResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name :String,
        @Field("email") email : String,
        @Field("password") password : String,
        @Field("c_password") C_password : String
    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("login_activity")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>

    @GET("shop")
    fun getShop(@Header("api_token") value: String): Call<ShopResponse>
}