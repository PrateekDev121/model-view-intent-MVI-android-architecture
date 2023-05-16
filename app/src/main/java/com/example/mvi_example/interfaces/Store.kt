package com.example.mvi_example.interfaces

interface Store<A> {
    fun dispatch(action:A)
}