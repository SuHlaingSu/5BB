package com.fivebb.shared.network

sealed class Result<out T> {

    class Success<out T : Any>(val data: T) : Result<T>()

    class Error(val errorMessage: String) : Result<Nothing>()
}