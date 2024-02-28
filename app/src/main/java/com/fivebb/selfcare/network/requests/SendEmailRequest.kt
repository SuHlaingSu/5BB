package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class SendEmailRequest (
    @SerializedName("CustomerAccountNo")
    var accountNumber: String = "",

    @SerializedName("ToEmail")
    var toEmail: String = "",

    @SerializedName("ActivityType")
    var activityType: String = "",

    @SerializedName("Subject")
    var subject: String = "",

    @SerializedName("Body")
    var body: String = ""
)