package com.example.myapplication

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetofitDataRepo {
        fun create(): RESTAPIEndPoint {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://reqres.in/")
                .build()
            return retrofit.create(RESTAPIEndPoint::class.java)


    }


}