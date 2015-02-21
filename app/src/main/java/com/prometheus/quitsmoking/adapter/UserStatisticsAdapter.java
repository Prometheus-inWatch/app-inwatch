package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.prometheus.quitsmoking.fragment.DaysWithoutSmokingFragment;
import com.prometheus.quitsmoking.fragment.SavingsFragment;
import com.prometheus.quitsmoking.fragment.TimeSavedFragment;
import com.prometheus.quitsmoking.fragment.UnsmokedCigarsFragment;

/**
 * Created by david on 20/2/15.
 */
public class UserStatisticsAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 4;

    public UserStatisticsAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return SavingsFragment.newInstance();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return DaysWithoutSmokingFragment.newInstance();
            case 2: // Fragment # 0 - This will show FirstFragment different title
                return TimeSavedFragment.newInstance();
            case 3: // Fragment # 0 - This will show FirstFragment different title
                return UnsmokedCigarsFragment.newInstance();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
