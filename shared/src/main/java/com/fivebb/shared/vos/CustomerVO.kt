package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class CustomerVO (

    @SerializedName("accountNumber")
    val accountNumber: String?,

    @SerializedName("customerName")
    val customerName: String?,

    @SerializedName("accountId")
    val accountId: String?,

    @SerializedName("wscLoginStatus")
    val wscLoginStatus: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("accountStatus")
    val accountStatus: String?,

    @SerializedName("custAccounts")
    val custAccounts: MutableList<String>?

)