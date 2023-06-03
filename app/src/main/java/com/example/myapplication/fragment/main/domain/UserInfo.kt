package com.example.myapplication.fragment.main.domain

import com.google.gson.annotations.SerializedName

data class UserInfo(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("patientInfo")
	val patientInfo: PatientInfo? = null,

	@field:SerializedName("email")
	val email: String? = null
)


