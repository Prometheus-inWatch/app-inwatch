package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prometheus.quitsmoking.R;
import com.prometheus.quitsmoking.TipManager;

import butterknife.InjectView;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by david on 20/2/15.
 */
public class TipFragment extends Fragment {

    @InjectView(R.id.daily_tip_text)
    TextView dailyTipText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tip, container, false);
        TextView dailyTipText = (TextView)view.findViewById(R.id.daily_tip_text);
        dailyTipText.setText(TipManager.getRandomDailyTip(getActivity().getBaseContext()));
        return view;
    }

    public static Fragment newInstance() {
        return new TipFragment();
    }
}
