package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PXNoteVo (
    @SerializedName("Note_Eng")
    var note_eng:String?= null,
    @SerializedName("Note_MM")
    var note_mm:String?= null
)