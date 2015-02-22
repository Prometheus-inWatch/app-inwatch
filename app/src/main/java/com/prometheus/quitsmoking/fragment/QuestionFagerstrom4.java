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
public class QuestionFagerstrom4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fagerstrom_4, container, false);
        ButterKnife.inject(this,view);

        return view;

    }

    @OnClick(R.id.fager_41)
    public void fager41(){
        ((QuestionaryActivity)getActivity()).onFagerstromSelection();
    }

    @OnClick(R.id.fager_42)
    public void fager42(){
        ((QuestionaryActivity)getActivity()).onFagerstromSelection();
    }

    @OnClick(R.id.fager_43)
    public void fager43(){
        ((QuestionaryActivity)getActivity()).onFagerstromSelection();
    }

    @OnClick(R.id.fager_44)
    public void fager44(){
        ((QuestionaryActivity)getActivity()).onFagerstromSelection();
    }

    public static Fragment newInstance() {
        return new QuestionFagerstrom4();
    }
}
