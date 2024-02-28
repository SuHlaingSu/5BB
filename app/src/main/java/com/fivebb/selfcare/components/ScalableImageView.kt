package com.fivebb.selfcare.components

import android.content.Context
import android.view.View.MeasureSpec
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView


class ScalableImageView : ImageView {
    var isMeasured = true

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        try {
            val drawable = drawable

            if (drawable == null) {
                setMeasuredDimension(0, 0)
            } else {
                val width = MeasureSpec.getSize(widthMeasureSpec)
                val height =
                    width * drawable.intrinsicHeight / drawable.intrinsicWidth
                setMeasuredDimension(width, height)
            }
        } catch (e: Exception) {
            isMeasured = false
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }

    }
}