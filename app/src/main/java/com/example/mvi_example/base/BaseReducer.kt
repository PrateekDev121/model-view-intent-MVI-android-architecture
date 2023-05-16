package com.example.mvi_example.base

import com.example.mvi_example.interfaces.Reducer

abstract class BaseReducer<T, A> : Reducer {

    abstract fun reduce(state: T, action: A): T
}