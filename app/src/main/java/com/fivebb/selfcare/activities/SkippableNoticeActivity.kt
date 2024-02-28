package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.CheckVerificationPresenter
import com.fivebb.selfcare.mvp.views.CheckVerificationView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.CheckVericationVO
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_skippable_notice.*
import java.util.concurrent.TimeUnit

class SkippableNoticeActivity : BaseActivity(){

    var initialTimer = 5

    val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_skippable_notice)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setUpListener()
    }

    private fun setUpListener() {
        rlSkip.setOnClickListener {
            navigateToAppropriateScreen()
        }
    }

    override fun onStart() {
        super.onStart()

        Observable.interval(1, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                tvSeconds.text = (initialTimer - it).toString()
            }
            .also {
                compositeDisposable.add(it)
            }

        Observable.timer(5, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                navigateToAppropriateScreen()
            }.also {
                compositeDisposable.add(it)
            }
    }

    @SuppressLint("SuspiciousIndentation")
    private fun navigateToAppropriateScreen() {
        val isLogin = SharedPreferenceUtils.getIsLogin(applicationContext)
        val isStep = SharedPreferenceUtils.getIsStep(applicationContext)

        if (isLogin && isStep) {
          val intent =  HomeActivity.newIntent(
                this,
                SharedPreferenceUtils.getServiceType(applicationContext)
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        } else{
            val intent = LoginActivity.newIntent(this)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            SharedPreferenceUtils.deleteCusStep(applicationContext)
            finish()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            Intent(context, SkippableNoticeActivity::class.java)
            return Intent(context, SkippableNoticeActivity::class.java)
        }
    }

}