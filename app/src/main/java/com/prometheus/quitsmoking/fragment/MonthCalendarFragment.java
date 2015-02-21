package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.R;
import com.squareup.timessquare.CalendarPickerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
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

        Collection<Date> dates = new ArrayList<>();

        dates.add(new Date());

        Calendar mycalendar = Calendar.getInstance();
        mycalendar.add(Calendar.YEAR,+1);
        mycalendar.add(Calendar.DAY_OF_YEAR,-1);
        dates.add(mycalendar.getTime());

        mycalendar.add(Calendar.DAY_OF_YEAR,-2);
        dates.add(mycalendar.getTime());

        mycalendar.add(Calendar.DAY_OF_YEAR,-4);
        dates.add(mycalendar.getTime());


        calendar.highlightDates(dates);


        return view;
    }

    public static Fragment newInstance() {
        return new MonthCalendarFragment();
    }
}
