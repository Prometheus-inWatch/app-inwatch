package com.prometheus.quitsmoking;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.prometheus.quitsmoking.adapter.MainMenuAdapter;
import com.viewpagerindicator.LinePageIndicator;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends FragmentActivity {

    @InjectView(R.id.view_pager)
    ViewPager viewPager;

    @InjectView(R.id.view_pager_indicator)
    LinePageIndicator viewPagerIndicator;


    private MainMenuAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ButterKnife.inject(this);

        adapterViewPager = new MainMenuAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setOffscreenPageLimit(adapterViewPager.getCount());

        viewPagerIndicator.setViewPager(viewPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onPanicButtonPressed() {

        new MaterialDialog.Builder(this)
                .content(TipManager.getRandomTip(getBaseContext()))
                .positiveText("Hecho!")
                .negativeText("Otro")
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onNegative(MaterialDialog dialog) {
                        onPanicButtonPressed();
                    }

                    @Override
                    public void onPositive(MaterialDialog dialog) {
                        Toast.makeText(getApplicationContext(),"Ánimo!!! Dentro de poco serás una persona nueva :)",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

}
