package com.example.myapplication.fragment.patient.mainpage.doctors.doctors

import com.example.myapplication.fragment.main.domain.AddItem
import com.example.myapplication.fragment.patient.mainpage.examinations.Products
import com.example.myapplication.fragment.patient.mainpage.examinations.Result
import com.example.myapplication.fragment.patient.mainpage.firstaid.AidsItem

data class DoctorState(
    val error: String? = null,
    val success: String? = null,
    val isLoading: Boolean = false,
    val allDoctors: List<DoctorItem>? = null,
    val doctorInfo: DoctorItem? = null,
    val reserveInfo: AddItem? = null,
    val allCategories: List<Result>? = null,
    val allProducts: List<Products>? = null,
    val firstAid: List<AidsItem>? = null
)
