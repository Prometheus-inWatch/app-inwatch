package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.R;
import com.squareup.timessquare.CalendarPickerView;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by david on 20/2/15.
 */
public class MonthCalendarFragment extends Fragment {

    @InjectView(R.id.calendar_view)
    CalendarPickerView calendar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calendar_month, container, false);
        ButterKnife.inject(this,view);

        Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);

        Date today = new Date();
        calendar.init(today, nextYear.getTime())
                .withSelectedDate(today).inMode(CalendarPickerView.SelectionMode.SINGLE);

        calendar.highlightDates(Arrays.asList(new Date()));

        return view;
    }

    public static Fragment newInstance() {
        return new MonthCalendarFragment();
    }
}
