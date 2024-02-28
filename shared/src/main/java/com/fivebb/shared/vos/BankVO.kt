package com.fivebb.shared.vos

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BankVO(
    var id: Int = 0,
    var videoUrl: String = "",
    @DrawableRes
    var logo: Int = 0,
    @StringRes
    var actionText: Int = 0,
    var packageName: String = "",
    var code : String = "",
    var isChecked: Boolean = false,
    var appName : String = ""
)