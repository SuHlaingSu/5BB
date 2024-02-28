package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.mvp.presenters.AccountDetailsPresenter
import com.fivebb.selfcare.mvp.views.AccountDetailsView
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.viewpods.AccountDetailItemViewPod
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import kotlinx.android.synthetic.main.activity_account_detail_2.*
import kotlinx.android.synthetic.main.activity_profile.ivBack
import kotlinx.android.synthetic.main.view_pod_account_detail_item.*
import java.security.AccessController.getContext

class AccountDetailActivity : ApplicationBaseActivity(), EmailActionDelegate,AccountDetailsView {

    private var expandCustomerInfo = true

    private var expandContactInfo = true

    private var expandBillingInfo = true

    private var expandPlanDetail = true

    private lateinit var mPresenter : AccountDetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_detail_2)

        setUpPresenter()
        addListeners()

        mPresenter.onUiReady()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(AccountDetailsPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun addListeners() {
        ivBack.setOnClickListener {
            finish()
        }

        ivCustomerInfoExpand.setOnClickListener {
            mPresenter.onTapCustomerInfoExpend()
        }

       /* ivContactInfoExpand.setOnClickListener {
            mPresenter.onTapContactInfoExpend()
        }*/

        ivBillingInfoExpand.setOnClickListener {
            mPresenter.onTapBillingInfoExpend()
        }

       /* ivPlanDetailExpand.setOnClickListener {
            mPresenter.onTapPlanInfoExpend()
        }*/

        swipeRefresh.setOnRefreshListener {
            mPresenter.reloadCustomerDetails(applicationContext)
        }

        mPresenter.mErrorLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            checkErrorMessageAndRedirectLogin(it)
        })

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            hideLoadingDialog()
        })
    }

    override fun showCustomerBasicViewDetail(customerDetails: CustomerBasicViewDetailsVO) {
        swipeRefresh.isRefreshing = false
        bindDetails(customerDetails)
    }

    private fun bindDetails(data: CustomerBasicViewDetailsVO) {

        //AccountDetail
        val accountDetail = data.customerAccountDetails.values.first()

        val vpAccountNo = vpAccountNo as AccountDetailItemViewPod
        vpAccountNo.bindData(getString(R.string.lbl_detail_account_number), accountDetail.customerAccountNumber ?: "")

        val vpName = vpName as AccountDetailItemViewPod
        vpName.bindData(getString(R.string.lbl_detail_name), accountDetail.name ?: "")

        val vpDOB = vpDOB as AccountDetailItemViewPod
        vpDOB.bindData(getString(R.string.lbl_detail_dob), accountDetail.dateOfBirth ?: "")

        val vpTitle = vpTitle as AccountDetailItemViewPod
        vpTitle.bindData(getString(R.string.lbl_detail_title), accountDetail.title ?: "")

        val vpGender = vpGender as AccountDetailItemViewPod
        vpGender.bindData(getString(R.string.lbl_detail_gender), accountDetail.gender ?: "")

        val vpCreationDate = vpCreationDate as AccountDetailItemViewPod
        vpCreationDate.bindData(getString(R.string.lbl_detail_creation_date), accountDetail.creationDate ?: "")

        val vpStatus = vpStatus as AccountDetailItemViewPod
        vpStatus.bindData(getString(R.string.lbl_detail_status), accountDetail.status ?: "")

        //Contact Information
        val vpMobileNumber = vpMobileNumber as AccountDetailItemViewPod
        if(accountDetail.registeredMobileNumber!= null)
        {
            vpMobileNumber.bindData(getString(R.string.lbl_detail_mobile_number), "${accountDetail.registeredMobileNumber}, ${accountDetail.multipleMobileNumber ?: ""}")
        }else{
            vpMobileNumber.bindData(getString(R.string.lbl_detail_mobile_number), "${accountDetail.mobileNumber}, ${accountDetail.multipleMobileNumber ?: ""}")

        }
        val vpEmail = vpEmail as AccountDetailItemViewPod
        vpEmail.bindData(getString(R.string.lbl_detail_email), "${accountDetail.emailAddress}, ${accountDetail.multipleEmailAddress ?: ""}")
        vpEmail.onClick()
        vpEmail.setOnClickListener {
            onGetEmailList()
        }

        val vpAddress = vpAddress as AccountDetailItemViewPod
        vpAddress.bindData(getString(R.string.lbl_detail_address), accountDetail.address.toString())

        //Billing Informaion
        val billingDetail = data.billingAccountDetails.values.first()

       /* val vpBillingName = vpBillingName as AccountDetailItemViewPod
        vpBillingName.bindData(getString(R.string.lbl_detail_name), billingDetail.name ?: "")

        val vpBillingCreationDate = vpBillingCreationDate as AccountDetailItemViewPod
        vpBillingCreationDate.bindData(getString(R.string.lbl_detail_creation_date), billingDetail.creationDate ?: "")*/

        val vpBillingCurrency = vpBillingCurrency as AccountDetailItemViewPod
        vpBillingCurrency.bindData(getString(R.string.lbl_detail_currency), billingDetail.currency ?: "")

       /* val vpBillingStatus = vpBillingStatus as AccountDetailItemViewPod
        vpBillingStatus.bindData(getString(R.string.lbl_billing_status), billingDetail.status ?: "")*/

        val vpBillDeliveryMode = vpBillDeliveryMode as AccountDetailItemViewPod
        vpBillDeliveryMode.bindData(getString(R.string.lbl_bill_delivery_mode), billingDetail.billDeliveryMode ?: "")


        //Service Instance
        val serviceInstanceDetail = data.serviceInstanceDetails.values.first()

        val vpBillingCustomerType = vpBillingCustomerType as AccountDetailItemViewPod
        vpBillingCustomerType.bindData(getString(R.string.lbl_customer_type), serviceInstanceDetail.customerType ?: "")

        //Plan Detail
        val vpPlanName = vpPlanName as AccountDetailItemViewPod
        vpPlanName.bindData("Plan Name :", serviceInstanceDetail.name ?: "")

        val vpPlanType = vpPlanType as AccountDetailItemViewPod
        vpPlanType.bindData(getString(R.string.lbl_type), serviceInstanceDetail.type ?: "")

       /* val vpPlanStatus = vpPlanStatus as AccountDetailItemViewPod
        vpPlanStatus.bindData(getString(R.string.lbl_detail_status), serviceInstanceDetail.status ?: "")

        val vpPlanPromotionOffer = vpPlanPromotionOffer as AccountDetailItemViewPod
        vpPlanPromotionOffer.bindData(getString(R.string.lbl_promotion_offer), serviceInstanceDetail.promoName ?: "")*/

    }

    override fun showCustomerInfoExpend() {
        if (expandCustomerInfo) {
            ivCustomerInfoExpand.rotation = ivCustomerInfoExpand.rotation - 180.toFloat()
            groupCustomerInfo.visibility = View.GONE
            expandCustomerInfo = !expandCustomerInfo
        } else {
            ivCustomerInfoExpand.rotation = 180.toFloat()
            groupCustomerInfo.visibility = View.VISIBLE
            expandCustomerInfo = !expandCustomerInfo
        }
    }

    /*override fun showContactInfoExpend() {
        if (expandContactInfo) {
            ivContactInfoExpand.rotation = ivContactInfoExpand.rotation - 180.toFloat()
            groupContactInfo.visibility = View.GONE
            expandContactInfo = !expandContactInfo
        } else {
            ivContactInfoExpand.rotation = 180.toFloat()
            groupContactInfo.visibility = View.VISIBLE
            expandContactInfo = !expandContactInfo
        }

    }*/

    override fun showBillingInfoExpend() {
        if (expandBillingInfo) {
            ivBillingInfoExpand.rotation = ivBillingInfoExpand.rotation - 180.toFloat()
            groupBillingInfo.visibility = View.GONE
            expandBillingInfo = !expandBillingInfo
        } else {
            ivBillingInfoExpand.rotation = 180.toFloat()
            groupBillingInfo.visibility = View.VISIBLE
            expandBillingInfo = !expandBillingInfo
        }
    }

    /*override fun showPlanInfoExpend() {
        if (expandPlanDetail) {
            ivPlanDetailExpand.rotation = ivPlanDetailExpand.rotation - 180.toFloat()
            groupPlanType.visibility = View.GONE
            expandPlanDetail = !expandPlanDetail
        } else {
            ivPlanDetailExpand.rotation = 180.toFloat()
            groupPlanType.visibility = View.VISIBLE
            expandPlanDetail = !expandPlanDetail
        }
    }*/

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, AccountDetailActivity::class.java)
        }
    }

    override fun onGetEmailList() {

        startActivity(AddNewEmailAty.newIntent(applicationContext))
    }

    override fun onTapAddNew() {
        //TODO("Not yet implemented")
    }

    override fun onTapVerify() {
        //TODO("Not yet implemented")
    }

    /*override fun showBtnAdd() {
        TODO("Not yet implemented")
    }*/
}
