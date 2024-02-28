package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.ActivityLogAdapter
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.fragments.ChooseDateRangeFragment
import com.fivebb.selfcare.mvp.presenters.ActivityLogPresenter
import com.fivebb.selfcare.mvp.views.ActivityLogView
import com.fivebb.shared.pods.EmptyViewPod
import com.fivebb.shared.vos.ActivityLogVO
import kotlinx.android.synthetic.main.activity_logs.*

class ActivityLogsActivity : ApplicationBaseActivity(), ActivityLogView{

    override fun getContext(): Context = applicationContext

    private lateinit var mActivityLogsAdapter: ActivityLogAdapter

    private lateinit var mPresenter: ActivityLogPresenter

    private var mFromDate = ""

    private var mToDate = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logs)

        initPresenter()
        initListeners()
        setUpRecyclerView()
        mPresenter.onUiReady()
    }

    private fun setUpRecyclerView() {
        mActivityLogsAdapter = ActivityLogAdapter()

        rvActivityLog.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        rvActivityLog.adapter = mActivityLogsAdapter
        rvActivityLog.setEmptyView(vpEmpty as EmptyViewPod)
    }

    private fun initListeners() {
        ivBack.setOnClickListener {
            finish()
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

        swipeRefresh.setOnRefreshListener {
            mPresenter.onUiReady()
        }

        btnFilter.setOnClickListener {
            mPresenter.onTapFilter()
        }
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(ActivityLogPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    override fun showActivityLog(activityLogList: MutableList<ActivityLogVO>,fromDate: String, toDate: String) {
        this.mFromDate = fromDate
        this.mToDate = toDate

        mActivityLogsAdapter.setNewData(activityLogList)
    }

    override fun showDatePickerDialog() {
        val bundle = Bundle()
        bundle.putString(ChooseDateRangeFragment.FROM_DATE, mFromDate)
        bundle.putString(ChooseDateRangeFragment.TO_DATE, mToDate)

        ChooseDateRangeFragment.newInstance(bundle,mPresenter)
            .show(supportFragmentManager, ChooseDateRangeFragment.CHOOSE_DATE_RANGE_FRAGMENT)
    }

    companion object {
        fun newInstance(context: Context) : Intent {
            return Intent(context, ActivityLogsActivity::class.java)
        }
    }


    fun onTapChooseDateRange(fromDate: String, toDate: String) {
        this.mFromDate = fromDate
        this.mToDate = toDate
        mPresenter.filterLogsByDate(fromDate, toDate)
    }

    fun showDateRange(fromDate: String, toDate: String) {
        this.mFromDate = fromDate
        this.mToDate = toDate

        mPresenter.filterLogsByDate(fromDate, toDate)
    }
}
