package com.example.mvi_example

import android.util.Log
import com.example.mvi_example.base.BaseStore
import com.example.mvi_example.screenState.LoginScreenAction
import com.example.mvi_example.screenState.LoginScreenReducer
import com.example.mvi_example.screenState.LoginScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginScreenStore :
    BaseStore<LoginScreenState, LoginScreenAction, LoginScreenReducer>() {

    private val reducer = LoginScreenReducer()

    override val _currentState: MutableStateFlow<LoginScreenState> =
        MutableStateFlow(LoginScreenState.initialState)

    val currentState
        get() = _currentState.asStateFlow()

    override fun dispatch(action: LoginScreenAction) {
        val newState = reducer.reduce(_currentState.value,action)
        Log.d("LoginScreen","$newState")
        _currentState.value = newState
    }


}

