package com.example.pizzaapp3373.response.account

import android.os.Message

data class LoginRespose (
    val succes: Boolean,
    val message: String,
    val 'data': Data
)