package com.example.myapplication.fragment.main.domain

import com.google.gson.annotations.SerializedName

data class AuthResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: UserInfo? = null,

	@field:SerializedName("token")
	val token: String? = null
)



data class PatientInfo(

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("reservations")
	val reservations: List<String>? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("medicalRecord")
	val medicalRecord: List<String>? = null,

	@field:SerializedName("birthDate")
	val birthDate: String? = null,

	@field:SerializedName("pharmMedicines")
	val pharmMedicines: List<String>? = null,

	@field:SerializedName("favDoctors")
	val favDoctors: List<String>? = null
)
