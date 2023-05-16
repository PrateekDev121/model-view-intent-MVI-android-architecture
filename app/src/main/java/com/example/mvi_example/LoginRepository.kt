package com.example.mvi_example

import com.example.mvi_example.base.BaseRepository
import kotlinx.coroutines.delay

class LoginRepository:BaseRepository() {

    suspend fun doLogin(){
        delay(5000)
    }
}