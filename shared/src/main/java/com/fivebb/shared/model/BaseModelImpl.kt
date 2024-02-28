package com.fivebb.shared.model

import android.content.Context
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.HttpException
import java.io.IOException

abstract class BaseModelImpl: BaseModel {

    protected val UNDEFINED_MESSAGE = "Undefined message. Error message is null"

    private val ERROR_MSG_JSON_PARSING_EXCEPTION = "Can't parse error message. #JSONException"

    private val ERROR_MSG_IO_EXCEPTION = "Can't parse error message. #IOException"

    companion object {
        init {
//            System.loadLibrary("share-file")
        }
    }

    protected external fun appId(buildType: String): String

    protected external fun secretKey(buildType: String): String

    protected external fun baseUrl(flavor: String): String

    protected external fun imageBaseUrl(flavor: String): String

    fun getTextPlainOriginRequestBody(value: String): RequestBody {
        return RequestBody.create("text/plain".toMediaTypeOrNull(), value)
    }

    fun errorMessage(it: Throwable): String {
        return if (it.message != null) {
            getThrowableErrorMessage(it)
        } else {
            UNDEFINED_MESSAGE
        }
    }

    private fun getThrowableErrorMessage(it: Throwable): String {
        return if (it is HttpException) {
            try {
                val jObjError = JSONObject(it.response()?.errorBody()?.string())
                jObjError.getString("message")
            } catch (e: JSONException) {
                ERROR_MSG_JSON_PARSING_EXCEPTION
            } catch (e: IOException) {
                ERROR_MSG_IO_EXCEPTION
            }
        } else {
            it.message!!
        }
    }

    override fun init(context: Context) {

    }
}
