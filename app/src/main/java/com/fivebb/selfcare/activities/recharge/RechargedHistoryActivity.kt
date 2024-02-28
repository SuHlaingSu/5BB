package com.fivebb.selfcare.activities.recharge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.RechargedHistoryAdapter
import com.fivebb.shared.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_recharged_history.*

class RechargedHistoryActivity : BaseActivity(){

    private lateinit var mRechargedHIstoryAdapter: RechargedHistoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recharged_history)

        setUpRecyclerView()
        setUpListener()
    }

    private fun setUpRecyclerView() {
        mRechargedHIstoryAdapter = RechargedHistoryAdapter()
        rvRechargedHistory.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        rvRechargedHistory.adapter = mRechargedHIstoryAdapter
    }

    private fun setUpListener() {
        ivBack.setOnClickListener {
            finish()
        }
    }

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, RechargedHistoryActivity::class.java)
        }
    }

}