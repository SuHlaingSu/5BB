package com.fivebb.selfcare.adapters

import android.widget.ImageView
import com.fivebb.selfcare.R
import com.fivebb.shared.utils.SharedConstants
import ss.com.bannerslider.adapters.SliderAdapter
import ss.com.bannerslider.viewholder.ImageSlideViewHolder

class AdsSliderAdapter : SliderAdapter() {

    private var isFTTHUser: Boolean = true

    private val ftthCoverList = listOf(R.drawable.ftth_cover_1, R.drawable.ftth_cover_2, R.drawable.ftth_cover_3, R.drawable.ftth_cover_4, R.drawable.ftth_cover_5)
    private val lteCoverList = listOf(R.drawable.lte_cover_1, R.drawable.lte_cover_2, R.drawable.lte_cover_3, R.drawable.lte_cover_4, R.drawable.lte_cover_5)

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindImageSlide(position: Int, viewHolder: ImageSlideViewHolder) {
        if (isFTTHUser) {
            when (position) {
                0 -> viewHolder.bindImageSlide(ftthCoverList[0])
                1 -> viewHolder.bindImageSlide(ftthCoverList[1])
                2 -> viewHolder.bindImageSlide(ftthCoverList[2])
                3 -> viewHolder.bindImageSlide(ftthCoverList[3])
                4 -> viewHolder.bindImageSlide(ftthCoverList[4])
            }
        } else {
            when (position) {
                0 -> viewHolder.bindImageSlide(lteCoverList[0])
                1 -> viewHolder.bindImageSlide(lteCoverList[1])
                2 -> viewHolder.bindImageSlide(lteCoverList[2])
                3 -> viewHolder.bindImageSlide(lteCoverList[3])
                4 -> viewHolder.bindImageSlide(lteCoverList[4])
            }
        }
    }

    fun setUserType(userType: String) {
        isFTTHUser = (userType == SharedConstants.SERVICE_TYPE_FTTH)
    }

}