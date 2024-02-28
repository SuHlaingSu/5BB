package com.fivebb.selfcare.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.fivebb.selfcare.R
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.dialog_fragment_skippable_notice.view.*
import java.util.concurrent.TimeUnit

class SkippableNoticeDialogFragment : DialogFragment() {

    companion object {
        const val TAG = "SkippableNoticeDialogFragment"

        fun newFragment(): SkippableNoticeDialogFragment {
            return SkippableNoticeDialogFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, R.style.AppTheme)
    }

    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    var initialTimer = 5

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_fragment_skippable_notice, container, false)

        view.rlSkip.setOnClickListener {
            dismiss()
        }

        Observable.interval(1, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.tvSeconds.text = (initialTimer - 1).toString()
            }
            .also {
                compositeDisposable.add(it)
            }

        Observable.timer(5, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                dismiss()
            }.also {
                compositeDisposable.add(it)
            }

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}