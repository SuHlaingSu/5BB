package com.fivebb.shared.vos

import androidx.annotation.DrawableRes
import com.google.gson.annotations.SerializedName

data class TempPaymentVO (

    var id: Int = 0,

    var bankName: String = "",

    var code: String = "",

    var status: String = "",

    var sortOrder: Int = 0,

    var imageUrl: String = "",

    var isMobileActive: Boolean = false,

    var videoUrl: String = "",

    @DrawableRes
    var logo: Int = 0,

    var packageName: String = "",

    var isChecked: Boolean = false

)