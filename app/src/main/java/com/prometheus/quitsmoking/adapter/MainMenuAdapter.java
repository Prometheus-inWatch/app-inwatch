package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.prometheus.quitsmoking.fragment.DaysWithoutSmokingFragment;
import com.prometheus.quitsmoking.fragment.PanicButtonFragment;
import com.prometheus.quitsmoking.fragment.SavingsFragment;
import com.prometheus.quitsmoking.fragment.VerticalPagerFragment;

/**
 * Created by david on 20/2/15.
 */
public class MainMenuAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 6;

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
                return DaysWithoutSmokingFragment.newInstance();
            case 1:
                return VerticalPagerFragment.newInstance();
            case 2:
                return SavingsFragment.newInstance();
            case 3:
                return SavingsFragment.newInstance();
            case 4:
                return VerticalPagerFragment.newInstance();
            case 5:
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
