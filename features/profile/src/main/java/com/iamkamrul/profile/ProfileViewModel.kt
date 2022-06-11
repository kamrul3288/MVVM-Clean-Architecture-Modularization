package com.iamkamrul.profile

import com.iamkamrul.common.base.BaseViewModel
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.usecase.UserProfileUseCase
import com.iamkamrul.entity.UserProfileEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userProfileUseCase: UserProfileUseCase
) : BaseViewModel(){

    val action: (UserProfileUiAction) -> Unit

    private val _uiState = MutableStateFlow<UserProfileUiState<Any>>(UserProfileUiState.Loading(isLoading = true))
    val uiState: StateFlow<UserProfileUiState<Any>> get() = _uiState


    init {
        action = {
            when(it){
                is UserProfileUiAction.FetchUserProfile -> fetchUserProfile(it)
            }
        }
        action(UserProfileUiAction.FetchUserProfile())
    }

    private fun fetchUserProfile(data:UserProfileUiAction.FetchUserProfile){
        execute {
            _uiState.value = UserProfileUiState.Loading(true)
            val result = userProfileUseCase.execute(UserProfileUseCase.Params(userName = data.userName))
            _uiState.value = UserProfileUiState.Loading(false)
            when(result){
                is Result.Success-> _uiState.value = UserProfileUiState.Success(result.data)
                is Result.Error-> _uiState.value = UserProfileUiState.Error(result.message)
            }
        }
    }
}

sealed class UserProfileUiState<out R>{
    data class Loading(val isLoading:Boolean):UserProfileUiState<Boolean>()
    data class Error(val message:String):UserProfileUiState<String>()
    data class Success(val data:UserProfileEntity):UserProfileUiState<UserProfileEntity>()
}

sealed class UserProfileUiAction{
    data class FetchUserProfile(val userName:String = "kamrul3288"):UserProfileUiAction()
}