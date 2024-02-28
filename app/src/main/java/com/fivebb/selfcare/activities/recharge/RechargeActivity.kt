package com.fivebb.selfcare.activities.recharge

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.ApplicationBaseActivity
import com.fivebb.selfcare.adapters.recharge.RechargeListAdapter
import com.fivebb.selfcare.delegates.RechargeDelegate
import com.fivebb.selfcare.mvp.presenters.RechargeListPresenter
import com.fivebb.selfcare.mvp.views.RechargeView
import com.fivebb.shared.vos.RechargeVO
import kotlinx.android.synthetic.main.aty_choose_adv_month.*
import kotlinx.android.synthetic.main.aty_recharge.*
import kotlinx.android.synthetic.main.aty_recharge.terms
import java.util.*
import kotlin.collections.ArrayList

class RechargeActivity : ApplicationBaseActivity(),RechargeDelegate,RechargeView {
    private lateinit var mAdapter: RechargeListAdapter
    private lateinit var mPresenter: RechargeListPresenter
    lateinit var mDelegate: RechargeDelegate
    private val mRechargeList = ArrayList<RechargeVO>()

    companion object {
        fun newInstance(context: Context) : Intent {
            return Intent(context, RechargeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_recharge)

        setUpPresenter()
        setUpListeners()
        setUpRecyclerView()
        mPresenter.onUiReady()
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(RechargeListPresenter::class.java)
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
        mAdapter = RechargeListAdapter(this)
        rvRecharge.adapter = mAdapter
    }

    override fun getContext(): Context {
        return applicationContext
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun showData(rechargeList: List<RechargeVO>) {
        if(rechargeList.isNotEmpty())
        {
            mRechargeList.clear()
            mRechargeList.addAll(rechargeList)
            mAdapter.submitList(mRechargeList)
            mAdapter.notifyDataSetChanged()
        }
    }

    override fun showMessage(message: String) {
        showErrorMessage(message)
    }

    override fun onItemClick(recharge: RechargeVO) {
        val intent = Intent(this, RechargeTopUpActivity::class.java)
        intent.putExtra("recharge_list", recharge)
        startActivity(intent)
        Log.i("TAG", "onItemClick: $recharge")
    }

}