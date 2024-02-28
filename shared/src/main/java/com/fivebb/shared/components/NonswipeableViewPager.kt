package com.mmtutors.shared.components

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager


class NonSwipeableViewPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {

    var isSwipeAble: Boolean = false

    init {
        this.isSwipeAble = true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (this.isSwipeAble) {
            super.onTouchEvent(event)
        } else false

    }

    override fun performClick(): Boolean {
        return if (this.isSwipeAble) {
            super.performClick()
        } else false
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return if (this.isSwipeAble) {
            super.onInterceptTouchEvent(event)
        } else false

    }

    fun setPagingEnabled(enabled: Boolean) {
        this.isSwipeAble = enabled
    }

}