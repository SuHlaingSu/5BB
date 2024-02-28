package com.fivebb.shared.fragments
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.fivebb.shared.R

class LoadingFragment: DialogFragment() {

    companion object{
        const val TAG_LOADING_DALOG_FRAGMENT = "Loading Dialog Fragment"

        fun getFragment(): LoadingFragment{
            return LoadingFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_loading,container,false)
        isCancelable = false
        return view

    }
}