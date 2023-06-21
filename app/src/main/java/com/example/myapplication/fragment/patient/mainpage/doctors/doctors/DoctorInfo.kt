package com.example.myapplication.fragment.patient.mainpage.doctors.doctors

data class DoctorInfo1(

    val filter: Filter? = null,

    )

data class Filter(
    val name: String? = null,
    val role: String? = null,
    val speciality: String? = null,
    val _id: String? = null,
    val available: Boolean? = null,
    val categoryId: String? = null,
    val type: String? = null
)
