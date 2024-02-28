package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class SecretQuestionRequest (
    @SerializedName("userName")
    var userName: String = "",

    @SerializedName("secretQuestion")
    var userQuestion: String = "",

    @SerializedName("secretAnswer")
    var userAnswer: String = ""
)