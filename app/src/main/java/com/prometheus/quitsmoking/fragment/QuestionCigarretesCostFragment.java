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
public class QuestionCigarretesCostFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cigarretes_cost, container, false);
        ButterKnife.inject(this,view);
        return view;
    }

    @OnClick(R.id.less_4_euro)
    public void less4euro(){
        ((QuestionaryActivity)getActivity()).onCigarretesCost("less_4");
    }

    @OnClick(R.id.between4_5_euro)
    public void between4_5_euro(){
        ((QuestionaryActivity)getActivity()).onCigarretesCost("between4_5");
    }

    @OnClick(R.id.between5_6_euro)
    public void between5_6_euro(){
        ((QuestionaryActivity)getActivity()).onCigarretesCost("between5_6");
    }

    @OnClick(R.id.more_than_6_euro)
    public void more_than_6_euro(){
        ((QuestionaryActivity)getActivity()).onCigarretesCost("more_than_6");
    }

    public static Fragment newInstance() {
        return new QuestionCigarretesCostFragment();
    }
}
