package com.example.myapplication.fragment.patient.mainpage.doctors.doctors

data class DoctorState(
    val error: String? = null,
    val success : String? = null,
    val isLoading: Boolean = false,
    val allDoctors: List<DoctorItem>? = null,
)
