package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.prometheus.quitsmoking.CustomDialogs;
import com.prometheus.quitsmoking.R;

/**
 * Created by david on 20/2/15.
 */
public class StampFragment extends Fragment {

    private CheckBox okCheckbox;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_stamp, container, false);


        this.okCheckbox = (CheckBox)view.findViewById(R.id.okCheckbox);

        okCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                CustomDialogs.showDiscountDialog(getActivity());
            }
        });

        return view;
    }

    public static Fragment newInstance() {
        return new StampFragment();
    }
}
