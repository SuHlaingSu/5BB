package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class StaffVO (

    @SerializedName("staffId")
    val staffId: Int?,

    @SerializedName("name")
    val name: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("externalId")
    val externalId: Int?,

    @SerializedName("parentStaffId")
    val parentStaffId: Int?,

    @SerializedName("businessGroupId")
    val businessGroupId: Int?,

    @SerializedName("bghierachyId")
    val bghierachyId: Int?,

    @SerializedName("organizationId")
    val organizationId: Int?

)