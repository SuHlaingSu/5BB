package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class TicketConfigItemVO(

    @SerializedName("id")
    var id: String?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("alias")
    var alias: String?,

    @SerializedName("visibilityFlag")
    var visibilityFlag: String?
)