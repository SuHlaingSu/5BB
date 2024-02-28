package com.fivebb.shared.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ThemedSpinnerAdapter;
import com.fivebb.shared.R;
import com.fivebb.shared.viewitems.SpinnerViewItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aung on 11/8/16.
 */

public class SpinnerAdapter<T> extends BaseAdapter implements ThemedSpinnerAdapter {

    protected List<T> mData;
    protected final Helper mDropDownHelper;

    public SpinnerAdapter(Context context) {
        mDropDownHelper = new Helper(context);
    }

    public SpinnerAdapter(Context context, List<T> data) {
        mData = data;
        mDropDownHelper = new Helper(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int id) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mDropDownHelper.getDropDownViewInflater().inflate(R.layout.view_item_spinner, viewGroup, false);
        }

        if (view instanceof SpinnerViewItem) {
            SpinnerViewItem viSpinner = (SpinnerViewItem) view;
            viSpinner.bindData((String) getItem(position));
        }

        return view;
    }

    @Override
    public void setDropDownViewTheme(@Nullable Resources.Theme theme) {
        mDropDownHelper.setDropDownViewTheme(theme);
    }

    @Nullable
    @Override
    public Resources.Theme getDropDownViewTheme() {
        return mDropDownHelper.getDropDownViewTheme();
    }

    public int getPosition(String timeslot) {
        return mData.indexOf(timeslot);
    }

    public List<T> getSpinnerItems() {
        if (mData != null) {
            return mData;
        } else {
            return new ArrayList<>();
        }
    }

    public void setData(List<T> data) {
        mData = data;
        notifyDataSetChanged();
    }
}
