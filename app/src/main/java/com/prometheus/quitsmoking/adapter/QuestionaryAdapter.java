package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.prometheus.quitsmoking.fragment.QuestionCigarretesCostFragment;
import com.prometheus.quitsmoking.fragment.QuestionCigarretesPerDayFragment;
import com.prometheus.quitsmoking.fragment.UserDataFragment;
import com.prometheus.quitsmoking.fragment.WelcomeFragment;

/**
 * Created by david on 20/2/15.
 */
public class QuestionaryAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 6;

    public QuestionaryAdapter(FragmentManager fragmentManager) {
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
                return WelcomeFragment.newInstance();
            case 1:
                return QuestionCigarretesPerDayFragment.newInstance();
            case 2:
                return QuestionCigarretesCostFragment.newInstance();
            case 3:
                return UserDataFragment.newInstance();


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
