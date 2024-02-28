package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ActivityLogVO (
    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("customer_account_no")
    var customerAccountNo: String = "",

    @SerializedName("description")
    var description: String = "",

    @SerializedName("activity_date")
    var activityDate: String = "",

    @SerializedName("activity_type")
    var activityType: String = ""
)