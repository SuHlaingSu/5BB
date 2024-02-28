package com.fivebb.selfcare.activities.prepaid

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.ApplicationBaseActivity
import com.fivebb.selfcare.activities.recharge.RechargeTopUpActivity
import com.fivebb.selfcare.adapters.px.PXTopUpListAdapter
import com.fivebb.selfcare.delegates.PrepaidActionDelegate
import com.fivebb.selfcare.mvp.presenters.PXTopUpPresenter
import com.fivebb.selfcare.mvp.views.PXTopUpView
import com.fivebb.shared.vos.PXPlanListVO
import com.fivebb.shared.vos.PXPlanVO
import kotlinx.android.synthetic.main.aty_px_topup.*
import kotlinx.android.synthetic.main.aty_recharge.imgBack
import kotlinx.android.synthetic.main.aty_recharge.rvRecharge
import kotlinx.android.synthetic.main.aty_recharge.terms

class PXTopUpActivity : ApplicationBaseActivity(),PrepaidActionDelegate,PXTopUpView {
    private lateinit var mAdapter: PXTopUpListAdapter
    private lateinit var mPresenter: PXTopUpPresenter
    lateinit var mDelegate: PrepaidActionDelegate
    private  var mPXPricList :MutableList<PXPlanVO> = mutableListOf()

    companion object {
        fun newInstance(context: Context) : Intent {
            return Intent(context, PXTopUpActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_px_topup)

        setUpPresenter()
        setUpListeners()
        setUpRecyclerView()
        showLoadingDialog()
        mPresenter.onTapTopUp()
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(PXTopUpPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {
        imgBack.setOnClickListener {
            finish()
        }
        terms.setOnClickListener {
            val browserIntent =
                Intent(
                    Intent.ACTION_VIEW,
                    //Uri.parse("https://www.5bb.com.mm/ShowInformation/TermsAndConditions_LTEQuota")
                    Uri.parse("https://uatgtg.5bb.com.mm/ShowInformation/TermsAndConditions_LTEQuota")
                )
            startActivity(browserIntent)
        }
    }

    private fun setUpRecyclerView() {
        mAdapter = PXTopUpListAdapter(this)
        rvRecharge.adapter = mAdapter
    }

    override fun getContext(): Context {
        return applicationContext
    }

    override fun getPlanPriceList(data: PXPlanListVO) {
        Log.d("Plan List", "getPlanPriceList: " + data.planPriceList)
        hideLoadingDialog()
        if(data.planPriceList!!.size!=0)
        {
            data.planPriceList!!.let {
                mPXPricList.addAll(it)
                Log.d("Size", "getPlanPriceList: ${mPXPricList.size}")
                mAdapter.submitList(it)
            }
        }else{
            showErrorMessage("This Plan doesn't have plan.")
        }
        //for note
       /* val pxNote = data.noteVo
        if (pxNote == null) {
            lblPXNote.text = ""
        }
            else{
                var strNote = pxNote?.note_eng
                strNote = strNote?.replace("\\u25CF", "\u25BA")?.replace("\\n","\n\n");
                lblPXNote.text = strNote
            }*/
        }

    override fun onTapTopUp() {
        //no use
    }

    override fun onItemClick(pxPlanVO: PXPlanVO) {
        val intent = Intent(this, PXPaymentBankActivity::class.java)
        intent.putExtra("px_price_list", pxPlanVO)
        startActivity(intent)
        Log.i("TAG", "onItemClick: $pxPlanVO")
    }
}
