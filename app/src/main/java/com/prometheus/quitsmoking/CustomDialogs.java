package com.prometheus.quitsmoking;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * Created by david on 21/2/15.
 */
public class CustomDialogs {

    public static void showOfferDialog(final Context context){

        new MaterialDialog.Builder(context)
                .customView(R.layout.dialog_offer)
                .positiveText("Hecho!")
                .negativeText("En otro momento")
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onNegative(MaterialDialog dialog) {

                    }

                    @Override
                    public void onPositive(MaterialDialog dialog) {

                        String url = "http://www.example.com";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        context.startActivity(i);
                    }
                })
                .show();
    }
}
