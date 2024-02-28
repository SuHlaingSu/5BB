package com.fivebb.shared.components;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import mm.technomation.mmtext.MMTextView;

public class LatoRegularTextView extends MMTextView {

    public LatoRegularTextView(Context context) {
        super(context);
        if (!isInEditMode())
            init(context);
    }

    public LatoRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            init(context);
    }

    public LatoRegularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            init(context);
    }

    private void init(Context context) {
        Typeface t = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Regular.ttf");
        this.setTypeface(t);
    }

}
