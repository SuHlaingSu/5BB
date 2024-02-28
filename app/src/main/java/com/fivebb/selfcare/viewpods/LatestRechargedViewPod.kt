package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.fivebb.selfcare.delegates.LatestRechargedActionDelegate
import kotlinx.android.synthetic.main.viewpod_latest_recharged.view.*

class LatestRechargedViewPod @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : RelativeLayout(context, attr, defStyleAttr) {


    companion object {

        var mDelegate: LatestRechargedActionDelegate? = null

        fun newInstance(view: View, delegate: LatestRechargedActionDelegate): LatestRechargedViewPod {
            val viewPod = view as LatestRechargedViewPod
            mDelegate = delegate

            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnSeeAll.setOnClickListener {
            mDelegate?.onTapSeeAllRechargedHistory()
        }
    }
}