package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.QuestionaryActivity;
import com.prometheus.quitsmoking.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by david on 20/2/15.
 */
public class QuestionCigarretesPerDayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question_cigarretes_per_day, container, false);
        ButterKnife.inject(this,view);

        return view;

    }

    @OnClick(R.id.cigar_10)
    public void cigar_10(){
        ((QuestionaryActivity)getActivity()).onCigarAmount("cigar_10");
    }

    public static Fragment newInstance() {
        return new QuestionCigarretesPerDayFragment();
    }
}
