package com.fivebb.selfcare.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Point
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PopupActionDelegate
import com.fivebb.shared.vos.AppImageVO
import kotlinx.android.synthetic.main.dialog_ads.view.*

class AdsFragment: DialogFragment() {

    private lateinit var dialog: AlertDialog

    private lateinit var mDelegate: PopupActionDelegate

    private var mData: AppImageVO? = null

    companion object {

        const val ADS_FRAGMENT = "ADS_FRAGMENT"

        fun newInstance(data: AppImageVO) : AdsFragment {

            val adsFragment = AdsFragment()
            adsFragment.mData = data
            return adsFragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_ads, null)

        Glide.with(dialogView.ivContent)
            .asBitmap()
            .load(mData?.imageUrl ?: "")
            .placeholder(R.drawable.app_cover_pop_design)
            .addListener(object : RequestListener<Bitmap> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Bitmap>?,
                    isFirstResource: Boolean
                ): Boolean {
                    return false
                }

                override fun onResourceReady(
                    resource: Bitmap?,
                    model: Any?,
                    target: Target<Bitmap>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    //image is ready, you can get bitmap here
                    val bitmap = resource

                    val display = activity?.windowManager?.defaultDisplay
                    val size = Point()
                    display?.getSize(size)
                    val newWidth = size.x

                    val width = bitmap?.width
                    val height = bitmap?.height

                    val ratio = (height?.toFloat() ?: 0f) / (width?.toFloat() ?: 1f)
                    val scale = getContext()?.resources?.displayMetrics?.density
                    val newHeight = (scale?.let { (width?.times(ratio.toInt()))?.div(it) })?.toInt() ?: 0
                    dialogView.ivContent.layoutParams.height = newHeight
                    dialogView.ivContent.layoutParams.width = newWidth

                    return false
                }
            }).into(dialogView.ivContent)

        dialogView.tvContent.text = mData?.description ?: ""

        dialogView.btnClose.setOnClickListener {
            this.dismiss()
        }

        dialogView.btnMore.setOnClickListener {

            mData?.let {
                mDelegate.onTapMore(it.learnMoreUrl ?: "")
            }
            this.dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(dialogView)

        dialog = builder.create()
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)

        return dialog
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    fun setDelegate(delegate: PopupActionDelegate) {
        mDelegate = delegate
    }
}