package com.example.myapplication.common

import com.example.myapplication.fragment.main.domain.ReserveInfo
import com.example.myapplication.fragment.main.domain.ReserveResponse
import com.example.myapplication.fragment.main.domain.ResponseAuth
import com.example.myapplication.fragment.main.domain.UserInfo
import com.example.myapplication.fragment.main.login.LoginInfo
import com.example.myapplication.fragment.patient.mainpage.doctors.doctors.DoctorInfo1
import com.example.myapplication.fragment.patient.mainpage.doctors.doctors.DoctorsResponse
import com.example.myapplication.fragment.patient.mainpage.examinations.CategoriesResponse
import com.example.myapplication.fragment.patient.mainpage.firstaid.FirstAidFragment
import com.example.myapplication.fragment.patient.mainpage.firstaid.FirstAidResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface HospiService {

    @POST("api/v1//signUp")
    suspend fun registerUser(@Body userInfo: UserInfo):ResponseAuth
    @POST("api/v1//signIn")
    suspend fun loginUser(@Body loginInfo: LoginInfo): ResponseAuth

    @POST("api/v1/getAllUsers")
    suspend fun getDoctors(@Body doctorInfo: DoctorInfo1):DoctorsResponse

    @POST("api/v1//patient/reserve/reserve")
    suspend fun reserve(@Body reserveInfo: ReserveInfo, @Header("Authorization") token:String): ReserveResponse

    @POST("api/v1/patient/category/get")
    suspend fun getCategories(@Body doctorInfo: DoctorInfo1,@Header("Authorization") token:String): CategoriesResponse

    @POST("api/v1/patient/product/get")
    suspend fun getProducts(@Body doctorInfo: DoctorInfo1,@Header("Authorization") token:String): CategoriesResponse

    @POST("api/v1/patient/firstAid/get")
    suspend fun getFirstAid(@Body doctorInfo: DoctorInfo1,@Header("Authorization") token:String): FirstAidResponse

}

