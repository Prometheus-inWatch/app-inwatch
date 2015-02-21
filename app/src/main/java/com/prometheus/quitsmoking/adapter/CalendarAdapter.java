package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.prometheus.quitsmoking.fragment.MonthCalendarFragment;
import com.prometheus.quitsmoking.fragment.StampFragment;

/**
 * Created by david on 20/2/15.
 */
public class CalendarAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;

    public CalendarAdapter(FragmentManager fragmentManager) {
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
                return StampFragment.newInstance();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return MonthCalendarFragment.newInstance();

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
