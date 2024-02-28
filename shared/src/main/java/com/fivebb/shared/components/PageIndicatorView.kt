package com.fivebb.shared.components;

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.fivebb.shared.R
import com.fivebb.shared.utils.ScreenUtils

class PageIndicatorView : View {

    private val VIEW_TAG = "PageIndicatorView"

    private val WHITE_COLOR = -0x1
    private val GRAY_COLOR = -0x1
    private val mPaintNormalFill = Paint(ANTI_ALIAS_FLAG)
    private val mPaintSelectFill = Paint(ANTI_ALIAS_FLAG)

    private var mPadding: Float = 0.toFloat()
    private var mRadius: Float = 0.toFloat()

    private var currentPage: Int = 0
    private var numPage: Int = 0

    constructor(context: Context) : super(context, null) {
        this.init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        this.init()
    }//this(context, attrs, R.attr.vpiCirclePageIndicatorStyle);

    private fun init() {
        this.mPaintNormalFill.style = Paint.Style.FILL
        this.mPaintNormalFill.color = ContextCompat.getColor(context, R.color.default_button_bg)
        this.mPaintNormalFill.strokeWidth = 1.5f

        this.mPaintSelectFill.style = Paint.Style.FILL
        this.mPaintSelectFill.color = ContextCompat.getColor(context, R.color.colorAccent)

        this.numPage = 0
        this.currentPage = 0

        this.mRadius = ScreenUtils.getPixelFromDPI(context, 5f)
        this.mPadding = ScreenUtils.getPixelFromDPI(context, 15f)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        if (this.numPage == 0)
            return

        if (this.currentPage >= this.numPage) {
            this.setCurrentPage(this.numPage - 1)
            return
        }

        //only redraw if valid condition
        val width = this.width
        val realWidth = this.calculateWith()

        //center circle object
        var dx = (width / 2.0 - realWidth / 2.0).toFloat()
        val dy = 0f
        //Log.d(VIEW_TAG, "onDraw>>>" + realWidth + "/ " + width + " / height " + this.getHeight());
        for (iLoop in 0 until this.numPage) {

            if (iLoop == this.currentPage) {
                canvas.drawCircle(dx + mRadius, dy + mRadius, mRadius, mPaintSelectFill)
            } else {
                canvas.drawCircle(dx + mRadius, dy + mRadius, mRadius, mPaintNormalFill)
            }

            dx += mRadius * 2 + mPadding
        }
    }

    private fun calculateWith(): Float {
        return (this.numPage - 1) * mPadding + this.numPage.toFloat() * this.mRadius * 2f + 1f
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val newWidth = this.measureLong(widthMeasureSpec)
        val newHeight = this.measureShort(heightMeasureSpec)
        //Log.d(VIEW_TAG, "onMeasure>>>>>>>> " + newWidth + "/ " + newHeight);
        setMeasuredDimension(newWidth, newHeight)
    }

    /**
     * Determines the width of this view
     *
     * @param measureSpec
     * A measureSpec packed into an int
     * @return The width of the view, honoring constraints from measureSpec
     */
    private fun measureLong(measureSpec: Int): Int {
        var result: Int
        val specMode = View.MeasureSpec.getMode(measureSpec)
        val specSize = View.MeasureSpec.getSize(measureSpec)

        if (specMode == View.MeasureSpec.EXACTLY) {
            //We were told how big to be
            result = specSize
        } else {
            //Calculate the width according the views count
            result = (paddingLeft.toFloat() + paddingRight.toFloat()
                    + this.calculateWith()).toInt()
            //Respect AT_MOST value if that was what is called for by measureSpec
            if (specMode == View.MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize)
            }
        }
        return result
    }

    /**
     * Determines the height of this view
     *
     * @param measureSpec
     * A measureSpec packed into an int
     * @return The height of the view, honoring constraints from measureSpec
     */
    private fun measureShort(measureSpec: Int): Int {
        var result: Int
        val specMode = View.MeasureSpec.getMode(measureSpec)
        val specSize = View.MeasureSpec.getSize(measureSpec)

        if (specMode == View.MeasureSpec.EXACTLY) {
            //We were told how big to be
            result = specSize
        } else {
            //Measure the height
            result = (2 * mRadius + paddingTop.toFloat() + paddingBottom.toFloat() + 1f).toInt()
            //Respect AT_MOST value if that was what is called for by measureSpec
            if (specMode == View.MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize)
            }
        }
        return result
    }

    //public method
    fun setNumPage(num: Int) {
        this.numPage = num
        this.invalidate()
    }

    fun setCurrentPage(currentNum: Int) {
        this.currentPage = currentNum
        this.invalidate()
    }

}
