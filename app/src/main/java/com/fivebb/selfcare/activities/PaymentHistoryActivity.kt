package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.PaymentHistoryAdapter
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.fragments.ChooseDateRangeFragment
import com.fivebb.selfcare.mvp.presenters.PaymentHistoryPresenter
import com.fivebb.selfcare.mvp.views.PaymentHistoryView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.pods.EmptyViewPod
import com.fivebb.shared.vos.InvoiceVO
import com.fivebb.shared.vos.PaymentHistoryVO
import kotlinx.android.synthetic.main.activity_payment_history.*

class PaymentHistoryActivity : ApplicationBaseActivity(), PaymentHistoryView,PaymentHistoryFilterActionDelegate{

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: PaymentHistoryPresenter
    private lateinit var mPaymentHistoryAdapter: PaymentHistoryAdapter

    private var mFromDate = ""
    private var mToDate = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_history)

        setUpPresenter()
        setUpRecyclerView()
        setUpListeners()

       // mPresenter.onUiReady()
        mPresenter.onTapFilter(mFromDate,mToDate)
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(PaymentHistoryPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mPaymentHistoryAdapter = PaymentHistoryAdapter(this)
        rvPaymentHistory.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        rvPaymentHistory.adapter = mPaymentHistoryAdapter
        rvPaymentHistory.setEmptyView(vpEmpty as EmptyViewPod)
    }

    private fun setUpListeners() {
        ivBack.setOnClickListener {
            finish()
        }

        swipeRefresh.setOnRefreshListener {
            //mPresenter.refreshPaymentHistory()
            mPresenter.onTapFilter(mFromDate,mToDate)
            // mPresenter.onTapChooseDateRange(mFromDate,mToDate)
        }

        btnFilter.setOnClickListener {
            mPresenter.onTapFilter(mFromDate,mToDate)
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            swipeRefresh.isRefreshing = false
            checkErrorMessageAndRedirectLogin(it)
        })
    }

//    override fun showDateRange(fromDate: String, toDate: String) {
//        this.mFromDate = fromDate
//        this.mToDate = toDate
//
//        mPresenter.filterWithDateRange(fromDate, toDate)
//    }

    //    override fun onTapChooseDateRange(fromDate: String, toDate: String) {
//
//        this.mFromDate = fromDate
//        this.mToDate = toDate
//
//        mPresenter.filterWithDateRange(fromDate, toDate)
//    }

    override fun showPaymentHistory(paymentList: MutableList<PaymentHistoryVO>,fromDate: String,toDate: String) {
        this.mFromDate = fromDate
        this.mToDate = toDate
        //swipeRefresh.isRefreshing = false
        mPaymentHistoryAdapter.setNewData(paymentList)

    }

    override fun showFilterDateDialog(fromDate: String, toDate: String) {
        swipeRefresh.isRefreshing = false
        val bundle = Bundle()
        bundle.putString(ChooseDateRangeFragment.FROM_DATE, fromDate)
        bundle.putString(ChooseDateRangeFragment.TO_DATE, toDate)

        ChooseDateRangeFragment.newInstance(bundle,mPresenter)
            .show(supportFragmentManager, ChooseDateRangeFragment.CHOOSE_DATE_RANGE_FRAGMENT)

    }

    override fun onPaymentPDF(creditNo: String) {
    }

    override fun onViewPDF(creditNo: String) {

    }

    override fun afterClickDownload(invoiceVO: InvoiceVO) {
        //Toast.makeText(this,"Url link: " + invoiceVO.url,Toast.LENGTH_SHORT).show()
        startActivity(LatestPaymentDownloadPDFActivity.newIntent(applicationContext,invoiceVO.url))
    }

    override fun onViewClick(invoiceVO: InvoiceVO) {
        startActivity(DownloadPDFActivity.newIntent(applicationContext,invoiceVO.url))
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, PaymentHistoryActivity::class.java)
        }
    }

    override fun onTapChooseDateRange(fromDate: String, toDate: String) {
        TODO("Not yet implemented")
    }

    override fun onDownload(creditNo: String) {
        mPresenter.onDownloadPaymentPDF()
    }

    override fun onViewInvoice(creditNo: String) {
        mPresenter.onViewPaymentPDF()
    }

}