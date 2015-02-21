package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.prometheus.quitsmoking.fragment.PanicButtonFragment;
import com.prometheus.quitsmoking.fragment.TipFragment;
import com.prometheus.quitsmoking.fragment.VerticalCalendarPagerFragment;
import com.prometheus.quitsmoking.fragment.VerticalUserStatisticsFragment;

/**
 * Created by david on 20/2/15.
 */
public class MainMenuAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 4;

    public MainMenuAdapter(FragmentManager fragmentManager) {
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

            case 0:
                return VerticalUserStatisticsFragment.newInstance();
            case 1:
                return VerticalCalendarPagerFragment.newInstance();
            case 2:
                return TipFragment.newInstance();
            case 3:
                return PanicButtonFragment.newInstance();

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
