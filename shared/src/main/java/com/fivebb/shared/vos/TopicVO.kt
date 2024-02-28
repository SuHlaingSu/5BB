package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class TopicVO(
    @SerializedName("Topic")
    val topic : String = ""
)