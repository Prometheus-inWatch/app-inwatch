package com.prometheus.quitsmoking.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.prometheus.quitsmoking.fragment.QuestionCigarretesCostFragment;
import com.prometheus.quitsmoking.fragment.QuestionCigarretesPerDayFragment;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom1;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom2;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom3;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom4;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom5;
import com.prometheus.quitsmoking.fragment.QuestionFagerstrom6;
import com.prometheus.quitsmoking.fragment.UserDataFragment;
import com.prometheus.quitsmoking.fragment.WelcomeFragment;

/**
 * Created by david on 20/2/15.
 */
public class QuestionaryAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 8;

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
                return QuestionFagerstrom1.newInstance();
            case 2:
                return QuestionFagerstrom2.newInstance();
            case 3:
                return QuestionFagerstrom3.newInstance();
            case 4:
                return QuestionFagerstrom4.newInstance();
            case 5:
                return QuestionFagerstrom5.newInstance();
            case 6:
                return QuestionFagerstrom6.newInstance();
            case 7:
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
