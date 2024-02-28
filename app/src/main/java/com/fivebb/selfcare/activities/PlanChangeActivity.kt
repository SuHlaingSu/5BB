package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.share.Share
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.PlanAttributeAdapter
import com.fivebb.selfcare.adapters.PlanTypeAdapter
import com.fivebb.selfcare.delegates.DatePickerActionDelegate
import com.fivebb.selfcare.delegates.PlanTypeActionDelegate
import com.fivebb.selfcare.fragments.DatePickerFragment
import com.fivebb.selfcare.mvp.presenters.PlanChangePresenter
import com.fivebb.selfcare.mvp.views.PlanChangeView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceDetailsVO
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_plan_change.*
import kotlinx.android.synthetic.main.activity_plan_change.btnSubmit
import kotlinx.android.synthetic.main.activity_plan_change.ivBack

class PlanChangeActivity : ApplicationBaseActivity(),
    PlanChangeView{

    override fun sendEmailSuccess(successMessage: String) {
        Toast.makeText(applicationContext, successMessage, Toast.LENGTH_SHORT).show()
        finish()
    }

    override fun getContext(): Context = applicationContext

    override fun dataReady(customerBasicViewDetails: CustomerBasicViewDetailsVO?,
        serviceInstanceDetailsVO: ServiceInstanceDetailsVO?,
        planList: MutableList<PlanVO>) {

        customerDetail = customerBasicViewDetails

        this.serviceInstanceDetails = serviceInstanceDetailsVO

        if (customerDetail == null) {
            checkErrorMessageAndRedirectLogin(SharedConstants.UNAUTHORIZED_REQUEST)
        }

        currentChoosePlan = planList.first()

        this.planList = planList

        planTypeAdapter.setNewData(planList)

        //bind default choose
        bindChoosePlanDetails(currentChoosePlan)

        bindServiceInstance(serviceInstanceDetailsVO)
    }

    private lateinit var mPresenter: PlanChangePresenter

    private lateinit var planTypeAdapter: PlanTypeAdapter

    private lateinit var planAttributeAdapter: PlanAttributeAdapter

    private var planList: MutableList<PlanVO> = mutableListOf()

    private var currentChoosePlan: PlanVO = PlanVO()

    private var changeDate: String = ""

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, PlanChangeActivity::class.java)
        }
    }

    private var customerDetail: CustomerBasicViewDetailsVO? = null

    private var serviceInstanceDetails: ServiceInstanceDetailsVO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan_change)

        initPresenter()
        initListeners()
        setUpRecyclerView()

        mPresenter.onUiReady()

    }

    private fun initPresenter() {

        mPresenter = ViewModelProviders.of(this).get(PlanChangePresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {

        ivBack.setOnClickListener {
            finish()
        }

        btnSubmit.setOnClickListener {

            if (areRequiredFieldsFilled()) {
                confirmDialog(getString(R.string.confirm_msg_plan_change), clickOk = {

                    sendRequest()

                })
            } else showErrorMessage(getString(R.string.err_fill_information))
        }

        btnChooseDate.setOnClickListener {
            mPresenter.onTapChooseDate()
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

    private fun setUpRecyclerView() {
        planTypeAdapter = PlanTypeAdapter(mPresenter)
        planAttributeAdapter = PlanAttributeAdapter()

        rvPlanType.layoutManager =
            LinearLayoutManager(applicationContext, RecyclerView.HORIZONTAL, false)
        rvPlanType.adapter = planTypeAdapter

        rvPlanAttribute.layoutManager =
            LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        rvPlanAttribute.adapter = planAttributeAdapter
    }

    private fun sendRequest() {
        mPresenter.sendEmailAndSaveActivity(currentChoosePlan, changeDate)
    }

    private fun bindServiceInstance(serviceDetails: ServiceInstanceDetailsVO?) {

        serviceDetails?.let {
            tvPlanCost.text =
                resources.getString(R.string.cost_and_currency, it.price, it.currencyName)
        }

        val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(applicationContext)
        val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)

        tvPlanType.text = planVO.planShortName
        tvInternetSpeed.text = "${planVO.downloadSpeed?.toInt().toString()}" + " " + "${planVO.downloadUnit}"
    }

    private fun bindChoosePlanDetails(plan: PlanVO) {
        tvNewPlanCost.text = getString(R.string.cost_and_currency, plan.price.toString(), "MMK")
        tvPlanNote.text = plan.description

        planAttributeAdapter.setNewData(plan.features.split(",").toMutableList())
    }

    override fun showChooseDate(calendar: String) {
        changeDate = calendar
        btnChooseDate.text = calendar
    }

    override fun refreshPlanList(planList: MutableList<PlanVO>,plan: PlanVO) {
        currentChoosePlan = plan
        bindChoosePlanDetails(plan)

        planTypeAdapter.setNewData(planList)
    }

    private fun areRequiredFieldsFilled(): Boolean {
        return currentChoosePlan.id != 0 &&
                changeDate.isNotEmpty()
    }

    override fun showDatePickerFragment() {
        val datePickerFragment = DatePickerFragment.newInstance(mPresenter)
        datePickerFragment.show(supportFragmentManager, DatePickerFragment.DATE_PICKER_FRAGMENT)
    }

}