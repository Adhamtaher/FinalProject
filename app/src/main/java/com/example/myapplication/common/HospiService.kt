package com.example.myapplication.common

import com.example.myapplication.fragment.main.domain.ReserveInfo
import com.example.myapplication.fragment.main.domain.ReserveResponse
import com.example.myapplication.fragment.main.domain.ResponseAuth
import com.example.myapplication.fragment.main.domain.UserInfo
import com.example.myapplication.fragment.main.login.LoginInfo
import com.example.myapplication.fragment.patient.mainpage.doctors.doctors.DoctorsResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface HospiService {

    @POST("api/v1//signUp")
    suspend fun registerUser(@Body userInfo: UserInfo):ResponseAuth
    @POST("api/v1//signIn")
    suspend fun loginUser(@Body loginInfo: LoginInfo): ResponseAuth

    @GET("api/v1//patient/getDoctorList")
    suspend fun getDoctors(@Header("Authorization") token:String):DoctorsResponse

    @POST("api/v1//patient/reserve")
    suspend fun reserveDoctor(@Body reserveInfo: ReserveInfo): ReserveResponse

}

