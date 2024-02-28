package com.fivebb.shared.components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.util.AttributeSet;
/*import org.mmtextview.MMFontUtils;
import org.mmtextview.components.MMTextView;*/

import mm.technomation.mmtext.MMTextView;

/**
 * Created by aung on 2/19/18.
 */

public class RussoOneTextView extends MMTextView {

    public RussoOneTextView(Context context) {
        super(context);
        if (!isInEditMode())
            init(context);
    }

    public RussoOneTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            init(context);
    }

    public RussoOneTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            init(context);
    }

    private void init(Context context) {
        Typeface t = Typeface.createFromAsset(context.getAssets(), "fonts/RussoOne-Regular.ttf");
        this.setTypeface(t);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        /*if (!MMFontUtils.isSupportUnicode(getContext())) {
            super.setText(Html.fromHtml(MMFontUtils.uni2zg(text.toString())), type);
        } else {
            super.setText(Html.fromHtml(text.toString()), type);
        }*/
    }
}
