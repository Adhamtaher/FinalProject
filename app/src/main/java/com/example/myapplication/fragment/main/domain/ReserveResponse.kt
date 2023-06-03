package com.example.myapplication.fragment.main.domain

import com.google.gson.annotations.SerializedName

data class ReserveResponse(

	@field:SerializedName("add")
	val add: List<AddItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class Time(

	@field:SerializedName("from")
	val from: String? = null,

	@field:SerializedName("to")
	val to: String? = null
)

data class AddItem(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("fees")
	val fees: Int? = null,

	@field:SerializedName("patientId")
	val patientId: String? = null,

	@field:SerializedName("anotherPerson")
	val anotherPerson: Boolean? = null,

	@field:SerializedName("patName")
	val patName: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("visitType")
	val visitType: String? = null,

	@field:SerializedName("speciality")
	val speciality: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("docName")
	val docName: String? = null,

	@field:SerializedName("doctorId")
	val doctorId: String? = null,

	@field:SerializedName("__v")
	val v: Int? = null,

	@field:SerializedName("report")
	val report: Report? = null,

	@field:SerializedName("turnNum")
	val turnNum: Int? = null,

	@field:SerializedName("time")
	val time: Time? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("day")
	val day: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Report(

	@field:SerializedName("files")
	val files: List<Any?>? = null
)
