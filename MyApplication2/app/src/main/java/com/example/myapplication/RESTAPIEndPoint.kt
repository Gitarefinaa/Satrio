package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface RESTAPIEndPoint {
    @GET("api/login")
    fun LoginSuccess(email:String,password:String): Call<List<ModelUser>>
}