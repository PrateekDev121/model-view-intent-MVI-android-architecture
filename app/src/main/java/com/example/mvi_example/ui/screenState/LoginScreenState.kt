package com.example.mvi_example.ui.screenState

import com.example.mvi_example.helper.Constants
import com.example.mvi_example.helper.StatusBoolean

/**
 * This [LoginScreenState], is a data class and defines the current state of the [LoginScreen]
 */

data class LoginScreenState(
    val userName: String,
    val passWord: String,
    val isLoggingInProcess: Boolean,
    val isLoginFailed: StatusBoolean,
    val isLoginSuccessful: StatusBoolean,
    val errorMessage:String
) {
    companion object {
        val initialState = LoginScreenState(
            userName = "",
            passWord = "",
            isLoggingInProcess = false,
            isLoginSuccessful = StatusBoolean.NOT_APPLICABLE,
            isLoginFailed = StatusBoolean.NOT_APPLICABLE,
            errorMessage = Constants.EMPTY_STRING
        )
    }
}