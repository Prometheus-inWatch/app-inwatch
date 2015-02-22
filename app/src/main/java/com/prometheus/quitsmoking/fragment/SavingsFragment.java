package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.CustomDialogs;
import com.prometheus.quitsmoking.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by david on 20/2/15.
 */
public class SavingsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_savings, container, false);

        ButterKnife.inject(this,view);
        return view;
    }

    @OnClick(R.id.savings_image)
    public void savings_image(){

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                CustomDialogs.showOfferDialog(getActivity());
            }
        }, 2000);
    }


    public static Fragment newInstance() {
        return new SavingsFragment();
    }
}
