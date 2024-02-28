package com.fivebb.shared.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aung on 7/20/16.
 */
public class GenericFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private List<String> mFragmentTitles;

    public GenericFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mFragmentTitles = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }

    public void addTab(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    public void addTab(Fragment fragment) {
        mFragments.add(fragment);
        mFragmentTitles.add("Dummy Page Title");
        notifyDataSetChanged();
    }

    public List<String> getPageTitles() {
        return mFragmentTitles;
    }

    public Fragment getFragment(int position) {
        if (position < mFragments.size()) {
            return mFragments.get(position);
        }
        return null;
    }

    public void removeAllTabs() {
        mFragments.clear();
        mFragmentTitles.clear();
    }

    public void removeItem(Fragment fragment) {
        mFragments.remove(fragment);
    }

    public List<Fragment> getAddedFragments()  {
        return mFragments;
    }

    public void replaceTabTitle(int position, String newTitle) {
        mFragmentTitles.set(position, newTitle);
        notifyDataSetChanged();
    }


}
