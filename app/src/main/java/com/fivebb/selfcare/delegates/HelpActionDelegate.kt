package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.RegionVO

interface HelpActionDelegate {
    fun onShowroomClickItem (item: RegionVO)
}