package com.fivebb.selfcare.utils;

import android.widget.Scroller;

import android.content.Context;
import android.view.animation.Interpolator;

public class DurationScroller extends Scroller {

    private double scrollFactor = 1;

    public DurationScroller(Context context) {
        super(context);
    }

    DurationScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    void setScrollDurationFactor(double scrollFactor) {
        this.scrollFactor = scrollFactor;
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, (int)(duration * scrollFactor));
    }
}
