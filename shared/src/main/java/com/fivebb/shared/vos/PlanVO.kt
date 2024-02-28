package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PlanVO (
    @SerializedName("ID")
    var id: Int = 0,

    @SerializedName("service_type")
    var serviceType: String = "",

    @SerializedName("plan_short_name")
    var planShortName: String? = "",

    @SerializedName("plan_full_name")
    var planFullName: String = "",

    @SerializedName("description")
    var description: String = "",

    @SerializedName("isActive")
    var isActive: Boolean = false,

    @SerializedName("isShown")
    var isShown: Boolean = false,

    @SerializedName("download_speed")
    var downloadSpeed: Double? = null,

    @SerializedName("upload_speed")
    var uploadSpeed: Double = 0.0,

    @SerializedName("sortOrder")
    var sortOrder: Int = 0,

    @SerializedName("features")
    var features: String = "",

    @SerializedName("price")
    var price: Double = 0.0,

    @SerializedName("Category")
    var category: String = "",

    @SerializedName("UploadUnit")
    var uploadUnit: String = "",

    @SerializedName("DownloadUnit")
    var downloadUnit: String = "",

    @SerializedName("PkgDisplayName")
    var pkgDisplayName : String = "",

    var isSelected : Boolean = false
)