package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PaymentMethodVO (
    @SerializedName("ID")
    var id: Int = 0,

    @SerializedName("BankName")
    var bankName: String = "",

    @SerializedName("Code")
    var code: String = "",

    @SerializedName("Status")
    var status: String = "",

    @SerializedName("SortOrder")
    var sortOrder: Int = 0,

    @SerializedName("ImageUrl")
    var imageUrl: String = "",

    @SerializedName("IsMobileActive")
    var isMobileActive: Boolean = false,

    var isChecked: Boolean = false

)