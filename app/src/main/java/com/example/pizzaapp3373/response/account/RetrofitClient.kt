package com.example.pizzaapp3373.response.account

import com.example.pizzaapp3373.client.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{
    const val BASE_URL = "http:// 10.24.2.30/rest_api3373/index.php"

    val instance:Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(Api::class.java)
    }
}