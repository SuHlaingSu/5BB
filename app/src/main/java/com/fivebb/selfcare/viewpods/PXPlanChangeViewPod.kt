package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PXPlanChangeActionDelegate
import com.fivebb.selfcare.delegates.PlanChangeActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceDetailsVO
import com.google.gson.Gson
import kotlinx.android.synthetic.main.viewpod_plan_change.view.*
import kotlinx.android.synthetic.main.viewpod_px_plan_change.view.*
import kotlinx.android.synthetic.main.viewpod_px_plan_change.view.btnPlanChange
import kotlinx.android.synthetic.main.viewpod_px_plan_change.view.tvInternetSpeed
import kotlinx.android.synthetic.main.viewpod_px_plan_change.view.tvPlanCost
import kotlinx.android.synthetic.main.viewpod_px_plan_change.view.tvPlanType

class PXPlanChangeViewPod @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : RelativeLayout(context, attr, defStyleAttr) {

    companion object {
        var mDelegate: PXPlanChangeActionDelegate? = null

        fun newInstance(view: View,delegate:PXPlanChangeActionDelegate) : PXPlanChangeViewPod {
            val viewPod = view as PXPlanChangeViewPod
            mDelegate = delegate
            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnPlanChange.setOnClickListener {
            mDelegate?.onTapPXPlanChange()
        }
    }

    fun bindPlanDetails(details: ServiceInstanceDetailsVO?) {

        details?.let {

            tvPlanCost.text = resources.getString(R.string.cost_and_currency, it.price, it.currencyName)

            val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(context)
            val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)

            tvPlanType.text = planVO.pkgDisplayName
            tvInternetSpeed.text = context.getString(R.string.extension_mbps,planVO.downloadSpeed?.toInt().toString())
        }

    }
}