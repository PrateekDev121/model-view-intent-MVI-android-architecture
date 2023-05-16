package com.example.mvi_example.screenState

import com.example.mvi_example.base.BaseReducer
import com.example.mvi_example.helper.StatusBoolean
import com.example.mvi_example.screenState.LoginScreenAction.UsernameEdit

class LoginScreenReducer : BaseReducer<LoginScreenState, LoginScreenAction>() {

    override fun reduce(state: LoginScreenState, action: LoginScreenAction): LoginScreenState {
        return when (action) {
            is UsernameEdit -> {
                state.copy(userName = action.userName)
            }

            is LoginScreenAction.PasswordEdit -> {
                state.copy(passWord = action.userName)
            }

            is LoginScreenAction.LoginClicked -> {
                state.copy(isLoggingInProcess = true)
            }

            is LoginScreenAction.DoLogin -> {
                state.copy(isLoggingInProcess = false, isLoginSuccessful = StatusBoolean.TRUE)
            }
        }
    }

}