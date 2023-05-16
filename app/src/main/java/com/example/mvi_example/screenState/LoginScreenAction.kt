package com.example.mvi_example.screenState

import com.example.mvi_example.base.BaseAction

sealed class LoginScreenAction: BaseAction() {
    data class UsernameEdit(val userName:String):LoginScreenAction()
    data class PasswordEdit(val userName:String):LoginScreenAction()
    object LoginClicked:LoginScreenAction()
    object DoLogin:LoginScreenAction()
}