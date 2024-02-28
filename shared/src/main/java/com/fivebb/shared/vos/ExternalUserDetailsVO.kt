package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName


data class ExternalUserDetailsVO (

    @SerializedName("userId")
    val userId: String?,

    @SerializedName("userName")
    val userName: String?,

    @SerializedName("accountType")
    val accountType: String?,

    @SerializedName("password")
    val password: String?,

    @SerializedName("visibilityFlag")
    val visibilityFlag: String?,

    @SerializedName("ipAddress")
    val ipAddress: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("isFirstLogin")
    val isFirstLogin: String?,

    @SerializedName("type")
    val type: String?,

    @SerializedName("role")
    val role: MutableList<String>?,

    @SerializedName("systemRole")
    val systemRole: String?,

    @SerializedName("staff")
    val staff: StaffVO?,

    //TODO add partner

    @SerializedName("customer")
    val customer: CustomerVO,

    @SerializedName("loginInfo")
    val loginInfo: MutableList<LoginInfoVO>,

    @SerializedName("isMSO")
    val isMSO: String?,

    @SerializedName("hasGeo")
    val hasGeo: String?
)