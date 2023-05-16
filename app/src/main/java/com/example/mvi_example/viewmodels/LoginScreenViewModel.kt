package com.example.mvi_example.viewmodels

import androidx.lifecycle.viewModelScope
import com.example.mvi_example.LoginRepository
import com.example.mvi_example.LoginScreenStore
import com.example.mvi_example.base.BaseViewModel
import com.example.mvi_example.screenState.LoginScreenAction
import kotlinx.coroutines.launch


class LoginScreenViewModel:BaseViewModel() {

    private val loginScreenStore = LoginScreenStore()
    private val loginRepository = LoginRepository()

    val screenState = loginScreenStore.currentState

    fun onUsernameEdit(value:String){
        val action = LoginScreenAction.UsernameEdit(value)
        loginScreenStore.dispatch(action)
    }

    fun onPasswordEdit(value:String){
        val action = LoginScreenAction.PasswordEdit(value)
        loginScreenStore.dispatch(action)
    }

    fun onLoginClicked(){
        val action = LoginScreenAction.LoginClicked
        loginScreenStore.dispatch(action)

        viewModelScope.launch {
            loginRepository.doLogin()
            loginScreenStore.dispatch(LoginScreenAction.DoLogin)
        }
    }
}