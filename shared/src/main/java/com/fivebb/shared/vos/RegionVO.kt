package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class RegionVO (

    @SerializedName("ID")
    val id : Int = 0,

    @SerializedName("RegionID")
    val regionId: Int = 0,

    @SerializedName("ActionTypeID")
    val actionTypeId: Int = 0,

    @SerializedName("Region")
    val region: String = "",

    @SerializedName("ActionType")
    val actionType: String = "",

    @SerializedName("PrimaryPhoneNo")
    val primaryPhoneNo: String? = null,

    @SerializedName("SecondaryPhoneNos")
    val secondaryPhoneNos: String? = null,

    @SerializedName("PrimaryEmail")
    val primaryEmail: String? = null,

    @SerializedName("CCEmails")
    val ccEmails: String? = null,

    @SerializedName("BCCEmails")
    val bccEmails: String? = null,

    @SerializedName("Address")
    val address: String? = null,

    @SerializedName("LatAndLong")
    val latAndLogn: String? = null,

    @SerializedName("Facebook")
    val facebookUrl: String? = null,

    @SerializedName("Youtube")
    val youTubeUrl: String? = null,

    @SerializedName("ShowRoomName")
    val showroomName : String? = null,

    var isSelected : Boolean = false


)