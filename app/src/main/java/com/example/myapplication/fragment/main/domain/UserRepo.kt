package com.example.myapplication.fragment.main.domain

import android.util.Log
import com.example.myapplication.common.HospiService
import com.example.myapplication.fragment.main.login.LoginInfo
import com.example.myapplication.utils.Status
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import javax.inject.Inject

class UserRepo @Inject constructor(private val hospiService: HospiService) {
    private val gson = Gson()

    fun loginUser(user: LoginInfo) = flow {

        try {
            emit(Status.Loading)

                val response = hospiService.loginUser(user)
                emit(Status.Success(response))

                Log.e("loginUser: ", response.toString())

        } catch (e: Throwable) {
            when (e) {
                is HttpException -> {
                    val type = object : TypeToken<AuthResponse>() {}.type
                    val errorResponse: AuthResponse? =
                        gson.fromJson(e.response()?.errorBody()!!.charStream(), type)
                    Log.e("loginUsereeeee: ", errorResponse?.message.toString())
                    emit(Status.Error( errorResponse?.message.toString()))
                }
                is Exception -> {
                    Log.e("loginUsereeeee: ", e.message.toString())
                    emit(Status.Error( e.message.toString()))
                }
            }
        }

    }.flowOn(Dispatchers.IO)

    fun registerUser(user: UserInfo) = flow {

        try {
            emit(Status.Loading)

            val response = hospiService.registerUser(user)
            emit(Status.Success(response))

            Log.e("loginUser: ", response.toString())

        } catch (e: Throwable) {
            when (e) {
                is HttpException -> {
                    val type = object : TypeToken<AuthResponse>() {}.type
                    val errorResponse: AuthResponse? =
                        gson.fromJson(e.response()?.errorBody()!!.charStream(), type)
                    Log.e("loginUsereeeee: ", errorResponse?.message.toString())
                    emit(Status.Error( errorResponse?.message.toString()))
                }
                is Exception -> {
                    Log.e("loginUsereeeee: ", e.message.toString())
                    emit(Status.Error( e.message.toString()))
                }
            }
        }

    }.flowOn(Dispatchers.IO)


    fun reserve(reserveInfo: ReserveInfo) = flow {
        emit(Status.Loading)
        try {
            val response = hospiService.reserveDoctor(reserveInfo)
            emit(Status.Success(response))
        }catch (e:Throwable){
            when (e) {
                is HttpException -> {
                    val type = object : TypeToken<AuthResponse>() {}.type
                    val errorResponse: AuthResponse? =
                        gson.fromJson(e.response()?.errorBody()!!.charStream(), type)
                    Log.e("loginUsereeeee: ", errorResponse?.message.toString())
                    emit(Status.Error( errorResponse?.message.toString()))
                }
                is Exception -> {
                    Log.e("loginUsereeeee: ", e.message.toString())
                    emit(Status.Error( e.message.toString()))
                }
            }
        }
    }

    fun getAllDoctors(token:String) = flow {
        emit(Status.Loading)
        try {
            val response = hospiService.getDoctors(token)
            emit(Status.Success(response))
        }catch (e:Throwable){
            when (e) {
                is HttpException -> {
                    val type = object : TypeToken<AuthResponse>() {}.type
                    val errorResponse: AuthResponse? =
                        gson.fromJson(e.response()?.errorBody()!!.charStream(), type)
                    Log.e("loginUsereeeee: ", errorResponse?.message.toString())
                    emit(Status.Error( errorResponse?.message.toString()))
                }
                is Exception -> {
                    Log.e("loginUsereeeee: ", e.message.toString())
                    emit(Status.Error( e.message.toString()))
                }
            }
        }
    }
}