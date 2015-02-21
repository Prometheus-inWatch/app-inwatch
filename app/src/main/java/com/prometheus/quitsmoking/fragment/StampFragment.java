package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.prometheus.quitsmoking.R;

import butterknife.OnCheckedChanged;

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
        this.okCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TU","Puta madre");
                okCheckbox.setVisibility(okCheckbox.isChecked()?CheckBox.VISIBLE:CheckBox.INVISIBLE);
            }
        });

        return view;
    }

    public static Fragment newInstance() {
        return new StampFragment();
    }
}
