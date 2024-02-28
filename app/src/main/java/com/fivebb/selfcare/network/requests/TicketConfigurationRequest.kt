package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class TicketConfigurationRequest(

    @SerializedName("masterSource")
    var masterSource: String,

    @SerializedName("ticketTypes")
    var ticketTypes: String,

    @SerializedName("ticketPriorities")
    var ticketPriorities: String,

    @SerializedName("ticketStatus")
    var ticketStatus: String,

    @SerializedName("serviceTypes")
    var serviceTypes: String,

    @SerializedName("resolutionRootCategories")
    var resolutionRootCategories: String,

    @SerializedName("cafNationality")
    var cafNationality: String
)