package com.fivebb.shared.network.responses
sealed class ResponseResult<out T: Any> {

    class Success<out T : Any>(val data: List<T>) : ResponseResult<T>()

    class Error(val message: String) : ResponseResult<Nothing>()
}