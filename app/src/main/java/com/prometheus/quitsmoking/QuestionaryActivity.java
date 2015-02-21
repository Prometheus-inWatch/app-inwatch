package com.prometheus.quitsmoking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.prometheus.quitsmoking.adapter.QuestionaryAdapter;
import com.viewpagerindicator.LinePageIndicator;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class QuestionaryActivity extends FragmentActivity {

    @InjectView(R.id.view_pager)
    ViewPager viewPager;

    @InjectView(R.id.view_pager_indicator)
    LinePageIndicator viewPagerIndicator;


    private QuestionaryAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionary);

        ButterKnife.inject(this);

        adapterViewPager = new QuestionaryAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setOffscreenPageLimit(adapterViewPager.getCount());

        viewPagerIndicator.setViewPager(viewPager);
    }


    public void onReadyButtonPressed() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
