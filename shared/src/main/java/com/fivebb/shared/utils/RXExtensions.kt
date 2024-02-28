package com.fivebb.shared.utils

import android.annotation.SuppressLint
import android.util.Log
import com.fivebb.shared.network.responses.BaseResponse
import com.fivebb.shared.network.responses.DataResponse
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//Data Response
@SuppressLint("CheckResult")
fun <T : DataResponse<W>, W> Observable<T>.subscribeDataResponse(
    success: (W) -> Unit,
    failure: (String) -> Unit
) {
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({
            it.processDataResponse({ data ->
                success(data)
            }, { message ->
                failure(message)
            })
        }, {
            Log.e("Model", it.localizedMessage, it)
            failure(extractMessage(it))
        })
}

private fun <T> DataResponse<T>?.processDataResponse(success: (T) -> Unit, failure: (String) -> Unit) {
    if (this != null) {
        if (this.isResponseOk()) {
            success.invoke(this.data!!)
        } else {
            failure(this.message)
        }
    } else {
        failure.invoke("Response Was Null")
    }
}

fun extractMessage(t: Throwable): String {
    return when {
        t.isNoConnection() -> ERROR_MESSAGE_NO_CONNECTION
        else -> t.message ?: ERROR_MESSAGE_NO_CONNECTION
    }
}

private const val ERROR_MESSAGE_NO_CONNECTION = "Please Check Internet Connection"

@SuppressLint("CheckResult")
fun Observable<BaseResponse>.subscribeBaseResponse(success: (String) -> Unit, failure: (String) -> Unit){
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({
            it.processBaseResponse({
                success.invoke(it)
            },{
                failure.invoke(it)
            })
        },{
            Log.e("Model",it.localizedMessage,it)
            failure(extractMessage(it))
        })
}

private fun BaseResponse.processBaseResponse(success: (String) -> Unit, failure: (String) -> Unit){
    if (this != null){
        if (this.isResponseOK()){
            success.invoke(this.message)
        }else{
            failure(this.message)
        }
    }else{
        failure.invoke("Response Was Null")
    }
}