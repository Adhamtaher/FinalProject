package com.example.myapplication.fragment.main.login

import com.example.myapplication.fragment.main.domain.AuthResponse
import com.example.myapplication.fragment.main.domain.ResponseAuth
import com.example.myapplication.fragment.main.domain.UserInfo

data class AuthState (
    val error: String? = null,
    val success : String? = null,
    val isLoading: Boolean = false,
    val userInfo: ResponseAuth? = null,
        )