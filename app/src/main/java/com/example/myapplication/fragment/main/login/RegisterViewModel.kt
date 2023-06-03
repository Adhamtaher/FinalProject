package com.example.myapplication.fragment.main.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.fragment.main.domain.UserInfo
import com.example.myapplication.fragment.main.domain.UserRepo
import com.example.myapplication.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class RegisterViewModel@Inject constructor(
    private val userRepo: UserRepo,
) :ViewModel() {
    private val _registerState = MutableStateFlow(AuthState())
    val registerState = _registerState.asStateFlow()

    suspend fun register(user: UserInfo) = viewModelScope.launch {
        userRepo.registerUser(user = user).collect {
            when (it) {
                is Status.Loading -> {
                    _registerState.value = registerState.value.copy(
                        isLoading = true
                    )
                }

                is Status.Success -> {
                    _registerState.value = registerState.value.copy(
                        isLoading = false,
                        success = it.data.message,
                    )
                }

                is Status.Error -> {
                    _registerState.value = registerState.value.copy(
                        isLoading = false,
                        error = it.message
                    )
                }
            }

        }
    }
}
