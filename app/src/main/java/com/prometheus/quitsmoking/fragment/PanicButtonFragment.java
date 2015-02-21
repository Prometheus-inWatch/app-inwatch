package com.prometheus.quitsmoking.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prometheus.quitsmoking.MainActivity;
import com.prometheus.quitsmoking.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by david on 20/2/15.
 */
public class PanicButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panic_button, container, false);

        ButterKnife.inject(this,view);
        return view;
    }

    @OnClick(R.id.panic_button)
    public void panic_button(){
        ((MainActivity)getActivity()).onPanicButtonPressed();
    }

    public static Fragment newInstance() {
        return new PanicButtonFragment();
    }
}
