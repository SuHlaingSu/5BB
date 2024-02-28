package com.fivebb.selfcare.components

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.os.Bundle
import android.os.Parcelable
import android.text.TextPaint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.fivebb.selfcare.R
import com.fivebb.shared.utils.SharedUtils

class ArcProgress @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :

    View(context, attrs, defStyleAttr) {

    private lateinit var paint: Paint

    private val rectF = RectF()

    private var strokeWidth: Float = 0.toFloat()

    var progress: Int=0
    var max: Int=0

    fun bindData(Progress: Int,Max: Int){
        progress = Progress
        max= Max

        if (progress > max){
            progress %=max
        }

        if (progress<0){
            progress = 0
        }

        invalidate()

        if (Max > 0) {
            max= Max
            invalidate()
        }

    }




//    var progress : Int = 0
//        set(progress) {
//
//            field = progress
//
//            if (this.progress > max) {
//                field %= max
//            }
//
//            if (this.progress < 0) {
//                field = 0
//            }
//
//            invalidate()
//        }
//
//    var max: Int = 0
//        set(max) {
//            if (max > 0) {
//                field = max
//                invalidate()
//            }
//        }
    private var finishedStrokeColor: Int = 0
    private var unfinishedStrokeColor: Int = 0
    private var strokeColor: Int = 0

    private var defaultStrokeColor = resources.getColor(R.color.colorPrimary)
    private val defaultFinishedColor = resources.getColor(android.R.color.holo_red_light)
    private val defaultUnfinishedColor = 0x60d2c8b6
    private val defaultStrokeWidth: Float
    private val defaultMax = 100
    private var defaultTextSize: Float = 0.toFloat()

    var width = 0.0f
    var height = 0.0f

    init {

        defaultTextSize = SharedUtils.sp2px(resources, resources.getDimension(R.dimen.text_regular_2x))
        defaultStrokeWidth = SharedUtils.dp2px(resources, resources.getDimension(R.dimen.margin_medium_2))

        val attributes = context.theme.obtainStyledAttributes(attrs, R.styleable.ArcProgress, defStyleAttr, 0)
        initByAttributes(attributes)
        attributes.recycle()

        initPainters()
    }

    protected fun initByAttributes(attributes: TypedArray) {

        finishedStrokeColor = attributes.getColor(R.styleable.ArcProgress_arc_finished_color, defaultFinishedColor)
        unfinishedStrokeColor = attributes.getColor(R.styleable.ArcProgress_arc_unfinished_color, defaultUnfinishedColor)
        strokeWidth = attributes.getDimension(R.styleable.ArcProgress_arc_stroke_width, defaultStrokeWidth)
        max = attributes.getInt(R.styleable.ArcProgress_arc_max, defaultMax)
        progress = attributes.getInt(R.styleable.ArcProgress_arc_progress, 0)
        strokeColor = attributes.getColor(R.styleable.ArcProgress_arc_stroke_color, defaultStrokeColor)
    }

    protected fun initPainters() {

        paint = Paint()
        paint.color = defaultUnfinishedColor
        paint.isAntiAlias = true
        paint.strokeWidth = strokeWidth
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
    }

    override fun invalidate() {
        initPainters()
        super.invalidate()
    }

    fun getStrokeWidth(): Float {
        return strokeWidth
    }

    fun setStrokeWidth(strokeWidth: Float) {
        this.strokeWidth = strokeWidth
        this.invalidate()
    }

    fun getFinishedStrokeColor(): Int {
        return finishedStrokeColor
    }

    fun setFinishedStrokeColor(finishedStrokeColor: Int) {
        this.finishedStrokeColor = finishedStrokeColor
        this.invalidate()
    }

    fun getUnfinishedStrokeColor(): Int {
        return unfinishedStrokeColor
    }

    fun setUnfinishedStrokeColor(unfinishedStrokeColor: Int) {
        this.unfinishedStrokeColor = unfinishedStrokeColor
        this.invalidate()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec)

        val width = View.MeasureSpec.getSize(widthMeasureSpec)
        val height = View.MeasureSpec.getSize(heightMeasureSpec)

        val radius = ((width / 2) * 0.7 ).toFloat()

        val centerX = width / 2

        val left = centerX - radius
        val top = height - radius - 20f
        val right = centerX + radius
        val bottom = height + radius - 25f

        rectF.set(left, top, right, bottom)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Stroke
        paint.isAntiAlias = true
        paint.color = strokeColor
        paint.strokeWidth = strokeWidth + 4
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeJoin = Paint.Join.ROUND

        canvas.drawArc(rectF, 180f, 180f, false, paint)

        // Unfinish Progress
        paint.isAntiAlias = true
        paint.color = unfinishedStrokeColor
        paint.strokeWidth = strokeWidth
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeJoin = Paint.Join.ROUND

        canvas.drawArc(rectF, 180f, 180f, false, paint)

        // Finished Progress
        paint.strokeWidth = strokeWidth
        paint.color = finishedStrokeColor
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeJoin = Paint.Join.ROUND

        val sweepAngle : Float = (180 * (max - progress) / max).toFloat()
        Log.d("SweepAngle -> ", sweepAngle.toString())

        //this is the red arc which has its sweep argument manipulated by on touch
        canvas.drawArc(rectF, 180f, sweepAngle, false, paint)

    }

    override fun onSaveInstanceState(): Parcelable? {
        val bundle = Bundle()
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState())
        bundle.putFloat(INSTANCE_STROKE_WIDTH, getStrokeWidth())
        bundle.putInt(INSTANCE_PROGRESS, progress)
        bundle.putInt(INSTANCE_MAX, max)
        bundle.putInt(INSTANCE_FINISHED_STROKE_COLOR, getFinishedStrokeColor())
        bundle.putInt(INSTANCE_UNFINISHED_STROKE_COLOR, getUnfinishedStrokeColor())
        return bundle
    }

    override fun onRestoreInstanceState(state: Parcelable) {
        if (state is Bundle) {
            strokeWidth = state.getFloat(INSTANCE_STROKE_WIDTH)
            max = state.getInt(INSTANCE_MAX)
            progress = state.getInt(INSTANCE_PROGRESS)
            finishedStrokeColor = state.getInt(INSTANCE_FINISHED_STROKE_COLOR)
            unfinishedStrokeColor = state.getInt(INSTANCE_UNFINISHED_STROKE_COLOR)
            initPainters()
            super.onRestoreInstanceState(state.getParcelable(INSTANCE_STATE))
            return
        }
        super.onRestoreInstanceState(state)
    }

    companion object {

        private val INSTANCE_STATE = "saved_instance"
        private val INSTANCE_STROKE_WIDTH = "stroke_width"
        private val INSTANCE_PROGRESS = "progress"
        private val INSTANCE_MAX = "max"
        private val INSTANCE_FINISHED_STROKE_COLOR = "finished_stroke_color"
        private val INSTANCE_UNFINISHED_STROKE_COLOR = "unfinished_stroke_color"
    }
}