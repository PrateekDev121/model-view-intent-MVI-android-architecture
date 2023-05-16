package com.example.mvi_example.screenState

import com.example.mvi_example.base.BaseScreenState
import com.example.mvi_example.helper.Constants
import com.example.mvi_example.helper.StatusBoolean

/**
 * This [LoginScreenState], is a data class and defines the current state of the LoginScreen
 */

data class LoginScreenState(
    val userName: String,
    val passWord: String,
    val isLoggingInProcess: Boolean,
    val isLoginSuccessful: StatusBoolean,
    val errorMessage:String
): BaseScreenState() {
    companion object {
        val initialState = LoginScreenState(
            userName = "",
            passWord = "",
            isLoggingInProcess = false,
            isLoginSuccessful = StatusBoolean.NOT_APPLICABLE,
            errorMessage = Constants.EMPTY_STRING
        )
    }
}