package com.fivebb.selfcare.network.responses

import com.fivebb.shared.vos.PlanVO
import com.google.gson.annotations.SerializedName

data class PlanResponse(

    @SerializedName("code")
    var code: Int = 0,

    @SerializedName("message")
    var message: String = "",

    @SerializedName("data")
    var planList: MutableList<PlanVO>?
)