package com.fivebb.selfcare.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0004J\b\u00102\u001a\u00020)H\u0004J\b\u00103\u001a\u00020)H\u0016J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u000206H\u0014J\u0018\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0014J\u0010\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<H\u0014J\n\u0010=\u001a\u0004\u0018\u00010<H\u0014J\u000e\u0010>\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010?\u001a\u00020)2\u0006\u0010#\u001a\u00020\rJ\u000e\u0010@\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015\u00a8\u0006B"}, d2 = {"Lcom/fivebb/selfcare/components/ArcProgress;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultFinishedColor", "defaultMax", "defaultStrokeColor", "defaultStrokeWidth", "", "defaultTextSize", "defaultUnfinishedColor", "finishedStrokeColor", "height", "getHeight", "()F", "setHeight", "(F)V", "max", "getMax", "()I", "setMax", "(I)V", "paint", "Landroid/graphics/Paint;", "progress", "getProgress", "setProgress", "rectF", "Landroid/graphics/RectF;", "strokeColor", "strokeWidth", "unfinishedStrokeColor", "width", "getWidth", "setWidth", "bindData", "", "Progress", "Max", "getFinishedStrokeColor", "getStrokeWidth", "getUnfinishedStrokeColor", "initByAttributes", "attributes", "Landroid/content/res/TypedArray;", "initPainters", "invalidate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setFinishedStrokeColor", "setStrokeWidth", "setUnfinishedStrokeColor", "Companion", "app_psrRelease"})
public final class ArcProgress extends android.view.View {
    private android.graphics.Paint paint;
    private final android.graphics.RectF rectF = null;
    private float strokeWidth = 0.0F;
    private int progress = 0;
    private int max = 0;
    private int finishedStrokeColor = 0;
    private int unfinishedStrokeColor = 0;
    private int strokeColor = 0;
    private int defaultStrokeColor;
    private final int defaultFinishedColor = 0;
    private final int defaultUnfinishedColor = 1624426678;
    private final float defaultStrokeWidth = 0.0F;
    private final int defaultMax = 100;
    private float defaultTextSize = 0.0F;
    private float width = 0.0F;
    private float height = 0.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.components.ArcProgress.Companion Companion = null;
    private static final java.lang.String INSTANCE_STATE = "saved_instance";
    private static final java.lang.String INSTANCE_STROKE_WIDTH = "stroke_width";
    private static final java.lang.String INSTANCE_PROGRESS = "progress";
    private static final java.lang.String INSTANCE_MAX = "max";
    private static final java.lang.String INSTANCE_FINISHED_STROKE_COLOR = "finished_stroke_color";
    private static final java.lang.String INSTANCE_UNFINISHED_STROKE_COLOR = "unfinished_stroke_color";
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public ArcProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ArcProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ArcProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getProgress() {
        return 0;
    }
    
    public final void setProgress(int p0) {
    }
    
    public final int getMax() {
        return 0;
    }
    
    public final void setMax(int p0) {
    }
    
    public final void bindData(int Progress, int Max) {
    }
    
    public final float getWidth() {
        return 0.0F;
    }
    
    public final void setWidth(float p0) {
    }
    
    public final float getHeight() {
        return 0.0F;
    }
    
    public final void setHeight(float p0) {
    }
    
    protected final void initByAttributes(@org.jetbrains.annotations.NotNull()
    android.content.res.TypedArray attributes) {
    }
    
    protected final void initPainters() {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    public final float getStrokeWidth() {
        return 0.0F;
    }
    
    public final void setStrokeWidth(float strokeWidth) {
    }
    
    public final int getFinishedStrokeColor() {
        return 0;
    }
    
    public final void setFinishedStrokeColor(int finishedStrokeColor) {
    }
    
    public final int getUnfinishedStrokeColor() {
        return 0;
    }
    
    public final void setUnfinishedStrokeColor(int unfinishedStrokeColor) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fivebb/selfcare/components/ArcProgress$Companion;", "", "()V", "INSTANCE_FINISHED_STROKE_COLOR", "", "INSTANCE_MAX", "INSTANCE_PROGRESS", "INSTANCE_STATE", "INSTANCE_STROKE_WIDTH", "INSTANCE_UNFINISHED_STROKE_COLOR", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}