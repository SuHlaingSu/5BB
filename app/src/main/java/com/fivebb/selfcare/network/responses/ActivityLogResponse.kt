package com.fivebb.selfcare.network.responses

import com.fivebb.shared.vos.ActivityLogVO
import com.google.gson.annotations.SerializedName

data class ActivityLogResponse (
    @SerializedName("code")
    var code: Int = 0,

    @SerializedName("message")
    var message: String = "",

    @SerializedName("data")
    var activityLogList: MutableList<ActivityLogVO>?
)