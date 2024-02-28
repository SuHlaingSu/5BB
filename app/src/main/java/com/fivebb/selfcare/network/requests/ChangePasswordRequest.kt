package com.fivebb.selfcare.network.requests

data class ChangePasswordRequest (
    var oldPassword: String,
    var newPassword: String,
    var confPassword: String
)