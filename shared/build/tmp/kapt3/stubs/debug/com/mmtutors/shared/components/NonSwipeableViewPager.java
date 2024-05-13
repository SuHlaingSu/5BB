package com.mmtutors.shared.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/mmtutors/shared/components/NonSwipeableViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isSwipeAble", "", "()Z", "setSwipeAble", "(Z)V", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "performClick", "setPagingEnabled", "", "enabled", "shared_debug"})
public final class NonSwipeableViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isSwipeAble = false;
    private java.util.HashMap _$_findViewCache;
    
    public NonSwipeableViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final boolean isSwipeAble() {
        return false;
    }
    
    public final void setSwipeAble(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean performClick() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final void setPagingEnabled(boolean enabled) {
    }
}