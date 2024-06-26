package com.fivebb.shared.viewitems;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fivebb.shared.R;
import com.fivebb.shared.delegates.AcceptData;

/**
 * Created by aung on 12/3/16.
 */

public class SpinnerViewItem extends FrameLayout implements AcceptData<String> {

    private TextView tvSpinner;

    public SpinnerViewItem(Context context) {
        super(context);
    }

    public SpinnerViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpinnerViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tvSpinner = findViewById(R.id.tv_spinner);
    }

    @Override
    public void bindData(String data) {
        tvSpinner.setText(data);
    }
}
