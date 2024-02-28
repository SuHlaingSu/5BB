package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class BSInfoVO (
    @SerializedName("serviceType")
    var service_type: String = "",

    @SerializedName("Category")
    var category: String = ""
)