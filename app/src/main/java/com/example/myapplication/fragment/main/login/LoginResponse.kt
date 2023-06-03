package com.example.myapplication.fragment.main.login

import com.google.gson.annotations.SerializedName


data class LoginResponse (
    @SerializedName("message")
    val message: String?,
    @SerializedName("added")
    val LoginAdded: List<LoginAdded?>?
        )