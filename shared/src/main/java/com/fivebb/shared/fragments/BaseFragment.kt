package com.fivebb.shared.fragments

import android.app.AlertDialog
import android.text.Html
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.fivebb.shared.R
import com.fivebb.shared.utils.SharedUtils
import com.google.android.material.snackbar.Snackbar
//import org.mmtextview.MMFontUtils

open class BaseFragment : Fragment() {

    private var mSnackBar: Snackbar? = null

    private var alertDialog: AlertDialog?= null

    private var mLoadingFragment: LoadingFragment?= null

    fun showSnackBar(msg: String, anchorView: View?) {
        if (anchorView != null) {
            mSnackBar = Snackbar.make(anchorView, Html.fromHtml(msg), Snackbar.LENGTH_LONG)
                    .setAction("Dismiss") {
                        if (mSnackBar != null)
                            mSnackBar!!.dismiss()
                    }
           // MMFontUtils.applyMMFontToSnackBar(mSnackBar)
            mSnackBar!!.show()
        }
    }

    protected fun showErrorMessage(message: String){
        if (alertDialog?.isShowing == true){
            return
        }

        if (alertDialog == null){
            alertDialog = AlertDialog.Builder(this.context)
                .setCancelable(true)
                .setIcon(R.drawable.ic_error_outline_24dp)
                .setTitle(R.string.lbl_app_title)
                .setPositiveButton(R.string.lbl_ok){dialog,_ -> dialog.dismiss()}
                .create()
        }
        alertDialog!!.apply { setMessage(SharedUtils.mmTextUnicodeOrigin(message,this.context)) }.show()
        positionDialogViews()
    }

    private fun positionDialogViews() {
        val messageView = alertDialog!!.findViewById<TextView>(android.R.id.message)!!
        messageView.setPadding(48, 48, 48, 48)
        messageView.gravity = Gravity.CENTER

        val positiveButton = alertDialog!!.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
        val positiveButtonLL = positiveButton.layoutParams as LinearLayout.LayoutParams
        positiveButtonLL.gravity = Gravity.CENTER
        positiveButton.layoutParams = positiveButtonLL
    }

    protected fun showLoadingDialog(){
        if (mLoadingFragment == null){
            mLoadingFragment = LoadingFragment.getFragment()
        }

        mLoadingFragment?.let {
            if (!it.isAdded){
                mLoadingFragment?.show(activity!!.supportFragmentManager,LoadingFragment.TAG_LOADING_DALOG_FRAGMENT)
            }
        }
    }

    protected fun hideLoadingDialog(){
        mLoadingFragment?.dismiss()
    }
}
