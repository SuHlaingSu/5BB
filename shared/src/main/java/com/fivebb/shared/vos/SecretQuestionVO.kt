package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class SecretQuestionVO (
    @SerializedName("userName")
    var userName: String?,

    @SerializedName("secretQuestion")
    var secretQuestion: String?,

    @SerializedName("secretAnswer")
    var secretAnswer: String?,

    @SerializedName("accountNumber")
    var accountNumber: String?,

    @SerializedName("accountTypeId")
    var accountTypeId: String?
)