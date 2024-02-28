package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class SaveActivityLogRequest (
    @SerializedName("CustomerAccountNo")
    var accountNumber: String = "",

    @SerializedName("ActivityType")
    var activityType: String = "",

    @SerializedName("Description")
    var description: String = ""
)