package com.fivebb.selfcare.network.requests

data class LoginRequest (
    var username: String = "",
    var password: String = "",
    var sId: Int = 0
)