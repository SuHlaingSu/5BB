package com.fivebb.selfcare.components

import android.content.Context
import android.util.AttributeSet
import android.view.DragEvent
import android.view.MotionEvent
import android.view.ViewParent
import com.google.android.gms.maps.MapView

class CustomMapView @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleArr: Int = 0
) :
    MapView(context, attr!!, defStyleArr) {

    private var viewParent: ViewParent? = null

    fun setParent(viewParent: ViewParent? = null) {
        viewParent?.let {
            this.viewParent = it
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> {
                viewParent?.requestDisallowInterceptTouchEvent(true)
            }

            MotionEvent.ACTION_UP -> {
                viewParent?.requestDisallowInterceptTouchEvent(false)
            }

        }
        return super.dispatchTouchEvent(ev)
    }
}