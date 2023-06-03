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
class LoginViewModel@Inject constructor(
    private val userRepo: UserRepo,
) :ViewModel() {
    private val _loginState = MutableStateFlow(AuthState())
    val loginState = _loginState.asStateFlow()

    suspend fun login(user: LoginInfo) = viewModelScope.launch {
        userRepo.loginUser(user = user).collect {
            when (it) {
                is Status.Loading -> {
                    _loginState.value = loginState.value.copy(
                        isLoading = true
                    )
                }

                is Status.Success -> {
                    _loginState.value = loginState.value.copy(
                        isLoading = false,
                        success = it.data.message,
                        userInfo = it.data

                    )
                }

                is Status.Error -> {
                    _loginState.value = loginState.value.copy(
                        isLoading = false,
                        error = it.message
                    )
                }
            }

        }
    }
}
