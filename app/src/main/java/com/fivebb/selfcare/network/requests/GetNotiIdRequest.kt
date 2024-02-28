package com.fivebb.selfcare.network.requests

import com.fivebb.shared.vos.NotificationVO
import com.google.gson.annotations.SerializedName

data class GetNotiIdRequest(
    @SerializedName("ID")
    val ID: Int = 0
)