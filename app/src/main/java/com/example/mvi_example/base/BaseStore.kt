package com.example.mvi_example.base

import com.example.mvi_example.interfaces.Store
import kotlinx.coroutines.flow.MutableStateFlow

abstract class BaseStore<T,A,R>:Store<A> {
    protected abstract val _currentState : MutableStateFlow<T>
}