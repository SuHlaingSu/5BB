package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.BulletSpan
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.advPaymentChooseMonth.AdvPaymentAdapter
import com.fivebb.selfcare.delegates.AdvPayMonthActionDelegate
import com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter
import com.fivebb.selfcare.mvp.views.AdvTopUpView
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.PlanPriceListVO
import kotlinx.android.synthetic.main.aty_choose_adv_month.ivBack
import kotlinx.android.synthetic.main.aty_choose_adv_month.rec_choose_month
import kotlinx.android.synthetic.main.aty_choose_adv_month.terms
import kotlinx.android.synthetic.main.aty_choose_adv_month_2.*
import kotlinx.android.synthetic.main.rdo_item.*


class ChooseAdvMonthActivity : ApplicationBaseActivity(),AdvTopUpView ,AdvPayMonthActionDelegate{
    private lateinit var mAdvPaymentAdapter: AdvPaymentAdapter
    private lateinit var mPresenter: AdvTopUpPresenter
    private  var monthList :MutableList<AdvPlanListVO> = mutableListOf()

    private lateinit var listPlan: AdvPlanListVO

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, ChooseAdvMonthActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_choose_adv_month_scroll)
        initPresenter()
        initListeners()
        setUpRecyclerView()
        mPresenter.getAdvPayMonth()
        terms.visibility = View.VISIBLE
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(AdvTopUpPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mAdvPaymentAdapter = AdvPaymentAdapter(this)
        rec_choose_month.adapter = mAdvPaymentAdapter
    }

    private fun initListeners() {

        ivBack.setOnClickListener {
            finish()
        }
        terms.setOnClickListener {
            val browserIntent =
                Intent(
                    Intent.ACTION_VIEW,
                    //Uri.parse("https://www.5bb.com.mm/showinformation/AdvPayTermsConditions?CustAccNo=" + SharedPreferenceUtils.getAccountId(this))
                    Uri.parse("https://uatgtg.5bb.com.mm/showinformation/AdvPayTermsConditions?CustAccNo=" + SharedPreferenceUtils.getAccountId(this))
                )
            startActivity(browserIntent)
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    override fun getContext(): Context {
        return applicationContext
    }

    override fun showAllBank(data: MutableList<BankVO>) {
        //TODO("Not yet implemented")
    }

    override fun showSelectedBankInfo(data: BankVO) {
        //TODO("Not yet implemented")
    }

    override fun showKBZPayAPP(data: KBZOrderInfoResponse) {
        //TODO("Not yet implemented")
    }

    override fun getPlanPriceList(data: PlanPriceListVO) {
        data.currentPlanVO.let {
              if(it?.adv_id!= 0)
              {
                  val intent = Intent(this, ChooseBankActivity::class.java)
                  intent.putExtra("current_list", it)
                  startActivity(intent)
                  Log.i("Current", it.toString())
              }
        }

        if (data.planPriceList!!.size != 0)
        {
            data.planPriceList!!.let {
                monthList.addAll(it)
                mAdvPaymentAdapter.submitList(it)
            }
        }else{
            showErrorMessage("This Plan doesn't have promotion plan.")
        }


        val note = data.noteVo
        if (note != null) {
           if (note.note == " "){
               lblNote.text = ""
           }
           else{
               var strNote = note?.note
               strNote = strNote?.replace("\\u25CF", "\u25BA")?.replace("\\n","\n\n");
               lblNote.text = strNote
           }
        }
    }

    private fun dp(dp: Int): Float {
        return resources.displayMetrics.density * dp
    }

    override fun goToBank() {
        //TODO("Not yet implemented")
    }

    override fun status(status: String) {
      //  TODO("Not yet implemented")
    }

    override fun chooseToPlan() {
        //TODO("Not yet implemented")
    }

    override fun ayaPayLink(data: AYARequestPushPaymentResponse) {
        TODO("Not yet implemented")
    }

    override fun requestQueryOrderAYAPay(data: AYAPayRequest) {
        TODO("Not yet implemented")
    }

    override fun responseOfAYAPay(message: String) {
        TODO("Not yet implemented")
    }

    override fun queryOrderAYAPay(data: AYAQueryOrderResponse) {
        TODO("Not yet implemented")
    }

    override fun mcfPayPaymentLink(data: CitizenPayResponse) {
        //TODO("Not yet implemented")
    }

    override fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse) {
        //TODO("Not yet implemented")
    }

    override fun callPayRetrieveStatus(status: CitizenPayRequest) {
        //TODO("Not yet implemented")
    }

    override fun requestWavePayResponse(data: WavePayResponse) {
       // TODO("Not yet implemented")
    }

    override fun requestQueryOrderWPay(data: WavePayRequest) {
      //  TODO("Not yet implemented")
    }

    override fun queryOrderWPay(data: WaveQueryOrderResponse) {
       // TODO("Not yet implemented")
    }

    override fun onSelectClick(item: AdvPlanListVO) {
        listPlan = AdvPlanListVO(
            item.id,
            item.promo_name_eng,
            item.promo_name_mm,
            item.plan_name,
            item.price,
            item.amount,
            item.cal_amt,
            item.note,
            item.taxPercentage,
            item.taxAmt,
            item.calTaxAmt,
            item.totAmt,
            item.calTotAmt
        )
           if(item.note != "")
                {
                    lblPlanNote.visibility = View.VISIBLE
                }else
                {
                    lblPlanNote.visibility = View.GONE
                }
        SharedPreferenceUtils.savePlanIdForAdvance(this, item.id.toString())

       /* val planID : String = SharedPreferenceUtils.getPlanIdForAdvance(this)
        Log.i("PLAN_ID", planID)*/
        mPresenter.takePlanAction()
        val intent = Intent(this, ChooseBankActivity::class.java)
        intent.putExtra("plan_list", listPlan)
        startActivity(intent)
        SharedPreferenceUtils.saveAdvPlanVO(this, listPlan)
        Log.i("Plan", listPlan.toString())
        finish()
    }

}



