package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class NoteVo (
    @SerializedName("Note")
    var note:String?= null
)