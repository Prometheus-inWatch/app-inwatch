package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.R;
import com.prometheus.quitsmoking.adapter.CalendarAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by david on 20/2/15.
 */
public class VerticalCalendarPagerFragment extends Fragment {

    @InjectView(R.id.vertical_view_pager)
    VerticalViewPager viewPager;

    private CalendarAdapter adapterViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vertical_view_pager_2, container, false);
        ButterKnife.inject(this,view);

        adapterViewPager = new CalendarAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setOffscreenPageLimit(adapterViewPager.getCount());

        return view;
    }

    public static Fragment newInstance() {
        return new VerticalCalendarPagerFragment();
    }
}
