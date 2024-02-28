package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.fivebb.selfcare.FiveBBApp
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.prepaid.PXPlanChangeActivity
import com.fivebb.selfcare.activities.prepaid.PXTopUpActivity
import com.fivebb.selfcare.activities.recharge.RechargeActivity
import com.fivebb.selfcare.activities.recharge.RechargedHistoryActivity
import com.fivebb.selfcare.adapters.AdsSlideAdapter
import com.fivebb.selfcare.adapters.OutstandingInvoiceAdapter
import com.fivebb.selfcare.delegates.*
import com.fivebb.selfcare.dialog.ForceUpdateDialog
import com.fivebb.selfcare.fragments.AdsFragment
import com.fivebb.selfcare.mvp.presenters.HomeScreenPresenter
import com.fivebb.selfcare.mvp.views.HomeScreenView
import com.fivebb.selfcare.utils.AutoScrollViewPager
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.selfcare.viewpods.*
import com.fivebb.shared.utils.PersistentUtil
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import kotlinx.android.synthetic.main.activity_main.autoScrollViewPager
import kotlinx.android.synthetic.main.activity_main.btnProfile
import kotlinx.android.synthetic.main.activity_main.lblOutstandingInvoice
import kotlinx.android.synthetic.main.activity_main.rvInvoicePayment
import kotlinx.android.synthetic.main.activity_main.swipeRefresh
import kotlinx.android.synthetic.main.activity_main.switchLanguageChange
import kotlinx.android.synthetic.main.activity_main.tvAccountName
import kotlinx.android.synthetic.main.activity_main.tvAccountNo
import kotlinx.android.synthetic.main.activity_main.viewPodLatestPayment
import kotlinx.android.synthetic.main.activity_main.viewPodNavigations
import kotlinx.android.synthetic.main.activity_main.viewPodPlanChange
import kotlinx.android.synthetic.main.activity_main.viewPodQuotaUsage
import kotlinx.android.synthetic.main.activity_main.viewPodUsageSummary
import kotlinx.android.synthetic.main.activity_main.viewPodWallet
import kotlinx.android.synthetic.main.activity_main.worm_dots_indicator
import kotlinx.android.synthetic.main.activity_main_2.*
import kotlinx.android.synthetic.main.activity_main_2.btnAdvPay
import kotlinx.android.synthetic.main.activity_profile.*

//import org.mmtextview.MMFontUtils


class HomeActivity : ApplicationBaseActivity(),PXPlanChangeActionDelegate,PlanChangeActionDelegate,
    NavigationActionDelegate, InvoicePaymentActionDelegate,
    LatestPaymentActionDelegate, LatestRechargedActionDelegate,PrepaidActionDelegate,
    HomeScreenView, PopupActionDelegate {

    override fun onTapMore(url: String) {
//        navigateToLink(LINK_FOR_POP_UP_ADS)
        navigateToLink(url)
    }

    override fun onUiReady(
        billList: MutableList<BillVO>,
        payment: MutableList<PaymentHistoryVO>,
        serviceInstanceDetails: ServiceInstanceDetailsVO?,
        serviceInstanceSummary: ServiceInstanceSummaryVO
    ) {
        swipeRefresh.isRefreshing = false

        payment.let {
            if (payment.size > 0) {
                latestPaymentViewPod.bindData(it.first())
                viewPodLatestPayment.visibility = View.VISIBLE
            } else {
                viewPodLatestPayment.visibility = View.GONE
            }
        }

//        billList.let {
//            if (billList.size > 0) {
//                showOutstandingInvoice()
//                mOutstandingInvoiceAdapter.setNewData(it)
//            } else {
//                hideOutstandingInvoice()
//            }
//        }
        //Bind Data for wallet
        walletViewPod.bindData()
        //Bind Usage Summary for LTE users
        usageSummaryViewPod.bindData(serviceInstanceSummary)

        if(SharedPreferenceUtils.getCategory(applicationContext)== SharedConstants.CATEGORY_PREPAID){
            viewPodPlanChange.visibility = View.GONE
            px_planChangeViewPod.bindPlanDetails(serviceInstanceDetails)
        }else{
            //Bind Data for Plan Details
            planChangeViewPod.bindPlanDetails(serviceInstanceDetails)
            viewPodPXPlanChange.visibility = View.GONE
        }
    }

    override fun showBillingList(billList: MutableList<BillVO>) {

        billList.let {
            if (billList.size > 0) {
                showOutstandingInvoice()
                mOutstandingInvoiceAdapter.setNewData(it)
            } else {
                hideOutstandingInvoice()
            }
        }
    }

    override fun showAdsDialog(data: AppImageVO) {
        //Show one time at application start
        if (FiveBBApp.showMainPrompt) {
            val adsFragment = AdsFragment.newInstance(data)
            adsFragment.setDelegate(this)
            adsFragment.show(supportFragmentManager, AdsFragment.ADS_FRAGMENT)
            FiveBBApp.showMainPrompt = !FiveBBApp.showMainPrompt
        }
    }

    override fun saveAdvPay(paymentVO: AdvancePaymentVO) {
        if(paymentVO.adjustedBalanceVO?.balance!="0")
        {
            SharedPreferenceUtils.saveAdvPay(applicationContext,paymentVO.adjustedBalanceVO?.balance.toString() + " MMK")
        }
        SharedPreferenceUtils.saveIsSufficient(applicationContext, paymentVO.adjustedBalanceVO!!.IsSufficient)
        SharedPreferenceUtils.saveAdvPay(applicationContext,paymentVO.adjustedBalanceVO?.balance.toString() + " MMK")

        paymentVO.getServiceBalanceVO?.let {
            quotaUsageSummaryViewPod.bindData(paymentVO.adjustedBalanceVO!!,
                it.nonMonentryBalanceVO)
        }
    }

    override fun showPXInfo(pxDetailVO: PXDetailVO) {
        Log.d("NextPlan", "showPXInfo: " + pxDetailVO.nextPlanVO)
        prepaidViewPod.bindData(pxDetailVO.adjustedBalanceVO!!,pxDetailVO.nextPlanVO,pxDetailVO.pXcurrentPlanVO)
    }

    override fun bindSliderImage(data: MutableList<AppImageVO>) {
        mAdsSlideAdapter.setData(data)
    }

    override fun getContext(): Context = applicationContext

    override fun onTapSeeAllRechargedHistory() {
        startActivity(RechargedHistoryActivity.newIntent(applicationContext))
    }

    override fun onTapSeeAllPaymentHistory() {
        startActivity(PaymentHistoryActivity.newIntent(applicationContext))
    }

    override fun onTapInvoicePdf() {
    }

    override fun onDownloadRequest(credit: String) {
        mPresenter.onDownloadPaymentPDF(credit)
    }

    override fun onViewInvoice(credit: String) {
        mPresenter.onViewPaymentPDF(credit)
    }

    override fun onTapPayment(bill: BillVO) {
        startActivity(
            InvoicePaymentActivity.newIntent(
                applicationContext,
                bill.amount.toString(),
                bill.unpaidAmount.toString(),
                bill.billMonth.toString(),
                bill.billNumber ?: "",
                bill.currencyName ?: "",
                bill.billDate ?: 0L,
                bill.dueDate ?: 0L,
                bill.billId ?: ""
            )
        )
    }

    override fun onTapRecharge() {
        startActivity(RechargeActivity.newInstance(applicationContext))    }

    override fun onTapActivityLog() {
        startActivity(ActivityLogsActivity.newInstance(applicationContext))
    }

    override fun onTapRelocation() {
        startActivity(RelocationActivity.newIntent(applicationContext))
    }

    override fun onTapTicket() {
        startActivity(CreateTicketActivity.newIntent(applicationContext))
    }

    override fun onTapNotification() {
        startActivity(NotificationActivity.newIntent(applicationContext))
    }

    override fun onTapHelp() {
        startActivity(HelpActivity.newIntent(applicationContext))
    }

    override fun onTapPlanChange() {
        startActivity(PlanChangeActivity.newIntent(applicationContext))
    }

    companion object {

        const val SERVICE_TYPE = "SERVICE_TYPE"

        fun newIntent(context: Context, serviceType: String): Intent {
            val intent = Intent(context, HomeActivity::class.java)
            intent.putExtra(SERVICE_TYPE, serviceType)
            return intent
        }
    }

    private lateinit var mPresenter: HomeScreenPresenter

    private lateinit var latestPaymentViewPod: LatestPaymentViewPod

    private lateinit var planChangeViewPod : PlanChangeViewPod

    private lateinit var px_planChangeViewPod : PXPlanChangeViewPod

    private lateinit var prepaidViewPod : PrepaidViewPod

    //private lateinit var prepaidNextPlanViewPod : PrepaidNextPlanViewPod

    private lateinit var walletViewPod: WalletViewPod

    private lateinit var navigationViewPod: NavigationViewPod

    private lateinit var usageSummaryViewPod: UsageSummaryViewPod

    private lateinit var quotaUsageSummaryViewPod:  QuotaUsageViewPod

    private lateinit var mOutstandingInvoiceAdapter: OutstandingInvoiceAdapter

    private lateinit var mAdsSlideAdapter: AdsSlideAdapter

    private lateinit var mServiceType: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

       /* MMFontUtils.initMMTextView(this) {
            changeLanguage()
        }*/

        initViewPods()
        getIntentExtraData()

        setUpPresenter()
        initListeners()
        bindLocalizedData()
        setUpAdapters()
        mPresenter.onUiReady(this)
        mPresenter.loadHomeScreenInfo()
        mPresenter.onHomeScreenUiReady()
        mPresenter.loadAppImageList()
        mPresenter.loadBillingList(this)
        mPresenter.getAdvPayment()
        if (SharedPreferenceUtils.getCategory(this)== SharedConstants.CATEGORY_PREPAID)
        {
            mPresenter.getPXDetails()
        }

        if (SharedPreferenceUtils.getServiceType(applicationContext) == SharedConstants.SERVICE_TYPE_LTE)
        {
            btnAdvPay.visibility = View.GONE
        }
        else{
            btnAdvPay.visibility = View.VISIBLE
        }

    }

    private fun getIntentExtraData() {
        intent.getStringExtra(SERVICE_TYPE).let {
            if (it != null) {
                mServiceType = it
            }else{
                mServiceType = SharedPreferenceUtils.getServiceType(this)
            }

            if (it == SharedConstants.SERVICE_TYPE_LTE) {
                uiForLTECustomer()
            } else uiForFTTHCustomer()
        }
    }

    override fun onResume() {
        super.onResume()
        mPresenter.loadHomeScreenInfo()
        mPresenter.loadBillingList(this)
        mPresenter.getAdvPayment()

        if (SharedPreferenceUtils.getCategory(this)== SharedConstants.CATEGORY_PREPAID)
        {
            mPresenter.getPXDetails()
        }
    }

    private fun initViewPods() {
        planChangeViewPod = PlanChangeViewPod.newInstance(viewPodPlanChange, this)

        walletViewPod = WalletViewPod.newInstance(viewPodWallet,this)

        quotaUsageSummaryViewPod = QuotaUsageViewPod.newInstance(viewPodQuotaUsage)

        prepaidViewPod = PrepaidViewPod.newInstance(viewPodPrepaid,this)

       // prepaidNextPlanViewPod = PrepaidNextPlanViewPod.newInstance(viewPodPrepaidNextPlan)

        px_planChangeViewPod = PXPlanChangeViewPod.newInstance(viewPodPXPlanChange,this)

        navigationViewPod = NavigationViewPod.newInstance(
            viewPodNavigations,
            this,
            SharedPreferenceUtils.getServiceType(applicationContext),
            SharedPreferenceUtils.getCategory(applicationContext)
        )

        latestPaymentViewPod = LatestPaymentViewPod.newInstance(viewPodLatestPayment, this)

        usageSummaryViewPod = UsageSummaryViewPod.newInstance(viewPodUsageSummary)
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(HomeScreenPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpAdapters() {

        mOutstandingInvoiceAdapter = OutstandingInvoiceAdapter(this)
        rvInvoicePayment.layoutManager =
            LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        rvInvoicePayment.adapter = mOutstandingInvoiceAdapter

        mAdsSlideAdapter = AdsSlideAdapter(supportFragmentManager)
        mAdsSlideAdapter.setUserType(mServiceType)
        /*val params: FrameLayout.LayoutParmas = LayoutParmas(30, 30) // FrameLayout is a parent-created by android framework

        autoScrollViewPager.setLayoutParmas(params) */

        autoScrollViewPager.adapter = mAdsSlideAdapter
        autoScrollViewPager.startAutoScroll(5000)
        autoScrollViewPager.interval = 5000
        autoScrollViewPager.slideBorderMode = AutoScrollViewPager.SLIDE_BORDER_MODE_TO_PARENT
        autoScrollViewPager.setBorderAnimation(false)

        worm_dots_indicator.setViewPager(autoScrollViewPager)

        autoScrollViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            var positionOffset = .0F
            var mCurrentPosition = 0

            override fun onPageScrollStateChanged(state: Int) {

                val lastPosition: Int = (autoScrollViewPager.adapter?.count ?: 5) - 1
                if (state == ViewPager.SCROLL_STATE_IDLE) {

                    autoScrollViewPager.isEnabled = true

                    if (mCurrentPosition == lastPosition && positionOffset == 0.0F) {
                        SystemClock.sleep(1000)
                        autoScrollViewPager.setCurrentItem(0, false)
                        autoScrollViewPager.isEnabled = false
                    } else if (mCurrentPosition == 0 && positionOffset == 0.0F) {
                        autoScrollViewPager.setCurrentItem(lastPosition, false)
                        autoScrollViewPager.isEnabled = false
                    }
                }
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                mCurrentPosition = position
                this.positionOffset = positionOffset
                Log.d(
                    "Pager",
                    "PageScrolled---- Position -> ${position} Offset -> ${positionOffset} Pixels -> ${positionOffsetPixels}"
                )
            }

            override fun onPageSelected(position: Int) {
//                mCurrentPosition = position
                Log.d("Pager", "Current item -> ${position}")
            }

        })
    }

    private fun initListeners() {

        btnProfile.setOnClickListener {
            mPresenter.onTapProfile()
        }

        switchLanguageChange.isChecked =
            PersistentUtil.newInstance(applicationContext)
                .getLanguage()!! == SharedConstants.SELECTED_LANGUAGE_MY

        switchLanguageChange.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                PersistentUtil.newInstance(applicationContext)
                    .saveLanguage(SharedConstants.SELECTED_LANGUAGE_MY)
                changeLanguage()
            } else {
                PersistentUtil.newInstance(applicationContext)
                    .saveLanguage(SharedConstants.SELECTED_LANGUAGE_EN)
                changeLanguage()
            }
        }

        swipeRefresh.setOnRefreshListener {
            bindLocalizedData()
            mPresenter.loadHomeScreenInfo()
            mPresenter.loadAppImageList()
            mPresenter.getAdvPayment()
            mPresenter.loadBillingList(this)
            if (SharedPreferenceUtils.getCategory(this)== SharedConstants.CATEGORY_PREPAID)
            {
                mPresenter.getPXDetails()
            }
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

    private fun showOutstandingInvoice() {
        lblOutstandingInvoice.visibility = View.VISIBLE
        rvInvoicePayment.visibility = View.VISIBLE
    }

    private fun hideOutstandingInvoice() {
        lblOutstandingInvoice.visibility = View.GONE
        rvInvoicePayment.visibility = View.GONE
    }

    private fun bindLocalizedData() {
        val cusData = SharedPreferenceUtils.getCustomerBasicDetail(applicationContext)

        val accountDetail = cusData?.customerAccountDetails?.values?.first()

        if (accountDetail != null) {
            tvAccountName.text = accountDetail.name ?: ""
        }
        SharedPreferenceUtils.saveName(applicationContext,tvAccountName.text.toString())
       //tvAccountName.text = SharedPreferenceUtils.getName(applicationContext)
        tvAccountNo.text = SharedPreferenceUtils.getAccountId(applicationContext)
    }

    private fun uiForLTECustomer() {
        hideOutstandingInvoice()
        if(SharedPreferenceUtils.getCategory(this) == SharedConstants.CATEGORY_QUOTA)
        {
           // SharedPreferenceUtils.getServiceInstanceName(this) == "Quota_Base_Plan"
            quotaUsageSummaryViewPod.visibility = View.VISIBLE
            usageSummaryViewPod.visibility = View.GONE
        }else{
            usageSummaryViewPod.visibility = View.VISIBLE
        }
        planChangeViewPod.visibility = View.GONE
    }

    private fun uiForFTTHCustomer() {
        if (SharedPreferenceUtils.getCategory(this)== SharedConstants.CATEGORY_PREPAID){
            planChangeViewPod.visibility = View.GONE
            px_planChangeViewPod.visibility = View.VISIBLE
            prepaidViewPod.visibility = View.VISIBLE
            usageSummaryViewPod.visibility = View.GONE
            quotaUsageSummaryViewPod.visibility = View.GONE
        }else if (SharedPreferenceUtils.getCategory(this)==SharedConstants.CATEGORY_BUSINESS){
            usageSummaryViewPod.visibility = View.GONE
            quotaUsageSummaryViewPod.visibility = View.GONE
            prepaidViewPod.visibility = View.GONE
            planChangeViewPod.visibility = View.VISIBLE
            px_planChangeViewPod.visibility = View.GONE
        }else{
            usageSummaryViewPod.visibility = View.GONE
            quotaUsageSummaryViewPod.visibility = View.GONE
            prepaidViewPod.visibility = View.GONE
            planChangeViewPod.visibility = View.VISIBLE
            px_planChangeViewPod.visibility = View.GONE
        }
    }

    private fun changeLanguage() {
        val intent = newIntent(this, SharedPreferenceUtils.getServiceType(applicationContext))
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun navigateToProfileActivity() {
        if (SharedPreferenceUtils.getServiceType(applicationContext)== SharedConstants.SERVICE_TYPE_LTE || SharedPreferenceUtils.getCategory(applicationContext)== SharedConstants.CATEGORY_PREPAID ) //|| SharedPreferenceUtils.getCategory(this) == SharedConstants.CATEGORY_BUSINESS
        {
            startActivity(LTEProfileActivity.newIntent(applicationContext))
        }
        else{
            startActivity(ProfileActivity.newIntent(applicationContext))
        }
    }

    override fun showForceUpdateDialog(isForceUpdate: Boolean, versionName: String) {

        val dialog = ForceUpdateDialog.newInstance(isForceUpdate = isForceUpdate,versionName = versionName) {
            navigateToGooglePlayStore()
        }
        dialog.show(supportFragmentManager,ForceUpdateDialog.TAG)
    }

    override fun afterClickDownload(invoiceVO: InvoiceVO) {
        startActivity(LatestPaymentDownloadPDFActivity.newIntent(applicationContext,invoiceVO.url))
    }

    override fun viewClickInvoice(invoiceVO: InvoiceVO) {
        startActivity(DownloadPDFActivity.newIntent(applicationContext,invoiceVO.url))
    }

    override fun navigateToGooglePlayStore() {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(
                "https://play.google.com/store/apps/details?id=com.fivebb.selfcare"
            )
            setPackage("com.android.vending")
        }
        startActivity(intent)
    }

    override fun onTapPXPlanChange() {
        startActivity(PXPlanChangeActivity.newIntent(applicationContext))
    }

    override fun onTapTopUp() {
        mPresenter.mShowProgressLoadingDialogLiveData.postValue(true)
        startActivity(PXTopUpActivity.newInstance(applicationContext))
        mPresenter.mHideProgressLoadingDialogLiveData.postValue(true)
    }

    override fun onItemClick(pxPlanVO: PXPlanVO) {
        TODO("Not yet implemented")
    }
}
