package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PlanChangeActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceDetailsVO
import com.google.gson.Gson
import kotlinx.android.synthetic.main.viewpod_plan_change.view.*

class PlanChangeViewPod @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : RelativeLayout(context, attr, defStyleAttr) {

    companion object {
        var mDelegate: PlanChangeActionDelegate? = null

        fun newInstance(view: View, delegate: PlanChangeActionDelegate) : PlanChangeViewPod {
            val viewPod = view as PlanChangeViewPod
            mDelegate = delegate

            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnPlanChange.setOnClickListener {
            mDelegate?.onTapPlanChange()
        }
    }

    fun bindPlanDetails(details: ServiceInstanceDetailsVO?) {

        details?.let {

            tvPlanCost.text = resources.getString(R.string.cost_and_currency, it.price, it.currencyName)

            val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(context)
            val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)

            tvPlanType.text =planVO.planShortName// planVO.planShortName
            tvInternetSpeed.text = context.getString(R.string.extension_mbps,planVO.downloadSpeed?.toInt().toString())
        }

    }
}