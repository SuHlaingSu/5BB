package com.fivebb.shared.pods;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fivebb.shared.R;

public class EmptyViewPod extends RelativeLayout {

    private TextView lblEmpty;
    private ImageView ivEmpty;
    private Button btnActionForEmpty;

    public EmptyViewPod(Context context) {
        super(context);
    }

    public EmptyViewPod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyViewPod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        lblEmpty = (TextView) findViewById(R.id.lbl_empty);
        ivEmpty = (ImageView) findViewById(R.id.iv_empty);
        btnActionForEmpty = (Button) findViewById(R.id.btn_action_for_empty);
    }

    public void setEmptyLabel(String emptyLabel) {
        lblEmpty.setText(emptyLabel);
    }

    public void setEmptyLabel(String emptyLabel, int textColor) {
        lblEmpty.setText(emptyLabel);
        lblEmpty.setTextColor(textColor);
    }

    public void setEmptyAction(String emptyAction, final EmptyActionDelegate delegate) {
        btnActionForEmpty.setVisibility(View.VISIBLE);
        btnActionForEmpty.setText(emptyAction);
        btnActionForEmpty.setOnClickListener(delegate);
    }

    public void setEmptyImage(int resourceId) {
        ivEmpty.setVisibility(VISIBLE);
        ivEmpty.setImageResource(resourceId);
    }

    public void removeEmptyImage() {
        ivEmpty.setVisibility(GONE);
    }

    public void removeEmptyLabel() {
        lblEmpty.setVisibility(GONE);
    }

    public void removeActionForEmpty() {
        btnActionForEmpty.setVisibility(GONE);
    }

    public interface EmptyActionDelegate extends OnClickListener {

        @Override
        void onClick(View v);
    }

}
