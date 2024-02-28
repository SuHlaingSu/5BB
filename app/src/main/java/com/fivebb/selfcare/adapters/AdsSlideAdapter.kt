package com.fivebb.selfcare.adapters

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.fragments.AdsSliderFragment
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.AppImageVO

class AdsSlideAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var isFTTHUser: Boolean = true
    private var mData: MutableList<AppImageVO> = mutableListOf()

    private val ftthCoverList = listOf(R.drawable.ftth_cover_1, R.drawable.ftth_cover_2, R.drawable.ftth_cover_3, R.drawable.ftth_cover_4, R.drawable.ftth_cover_5)
    private val lteCoverList = listOf(R.drawable.lte_cover_1, R.drawable.lte_cover_2, R.drawable.lte_cover_3, R.drawable.lte_cover_4, R.drawable.lte_cover_5)

    override fun getItem(position: Int): Fragment {

//        val imageDrawable = if (isFTTHUser) {
//            ftthCoverList[position]
//        } else {
//            lteCoverList[position]
//        }

        return AdsSliderFragment.newInstance(mData[position].imageUrl ?: "")
    }

    override fun getCount(): Int {
        return mData.size
    }

    fun setUserType(userType: String) {
        isFTTHUser = (userType == SharedConstants.SERVICE_TYPE_FTTH)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    fun setData(data: MutableList<AppImageVO>) {
        mData = data
        notifyDataSetChanged()
    }
}