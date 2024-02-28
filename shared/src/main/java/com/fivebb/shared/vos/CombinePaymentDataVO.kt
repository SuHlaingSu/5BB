package com.fivebb.shared.vos

import androidx.annotation.DrawableRes
import com.google.gson.annotations.SerializedName

data class CombinePaymentDataVO (
    var id: Int = 0,
    var videoUrl: String = "",
    var bankName: String = "",
    @DrawableRes
    var logo: Int = 0,
    var appName : String = "",
    var code: String = "",
    var status: String = "",
    var sortOrder: Int = 0,
    var isMobileActive: Boolean = false,
    var isChecked: Boolean = false
)