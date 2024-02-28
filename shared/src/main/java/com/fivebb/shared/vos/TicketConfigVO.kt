package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class TicketConfigVO (
    @SerializedName("masterSource")
    var masterSource: String?,

    @SerializedName("ticketPriorities")
    var ticketPriorities: String?,

    @SerializedName("ticketStatus")
    var ticketStatus: String?,

    @SerializedName("ticketTypes")
    var ticketTypes: String?,

    @SerializedName("serviceTypes")
    var serviceTypes: String?,

    @SerializedName("resolutionRootCategories")
    var resolutionRootCategories: String?
)