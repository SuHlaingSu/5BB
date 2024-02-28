package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.fivebb.selfcare.delegates.NavigationActionDelegate
import com.fivebb.shared.utils.SharedConstants
import kotlinx.android.synthetic.main.viewpod_navigations.view.*

class NavigationViewPod @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : FrameLayout(context, attr, defStyleAttr) {

    companion object {

        var mDelegate: NavigationActionDelegate? = null

        fun newInstance(view: View, delegate: NavigationActionDelegate, serviceType: String,category:String) : NavigationViewPod {
            val viewPod = view as NavigationViewPod
            mDelegate = delegate

            if (serviceType == SharedConstants.SERVICE_TYPE_LTE && category == SharedConstants.CATEGORY_QUOTA) {
                viewPod.vRelocation.visibility = View.GONE
                viewPod.llNavigation.weightSum = 5.toFloat()
            }else{
                viewPod.vRelocation.visibility = View.GONE
                viewPod.vRecharge.visibility = View.GONE
                viewPod.llNavigation.weightSum = 4.toFloat()
            }
            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        vRecharge.setOnClickListener {
            mDelegate?.onTapRecharge()
        }

        vActivityLogs.setOnClickListener {
            mDelegate?.onTapActivityLog()
        }

        vRelocation.setOnClickListener {
            mDelegate?.onTapRelocation()
        }

        vTicket.setOnClickListener {
            mDelegate?.onTapTicket()
        }

        vNotification.setOnClickListener {
            mDelegate?.onTapNotification()
        }

        vHelp.setOnClickListener {
            mDelegate?.onTapHelp()
        }
    }

}