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
                .customView(R.layout.dialog_offer, true)
                .positiveText("Hecho!")
                .negativeText("Más tarde")
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onNegative(MaterialDialog dialog) {

                    }

                    @Override
                    public void onPositive(MaterialDialog dialog) {

                        String url = "http://oferplan.ideal.es/plan-oferta/granada/circuito-spa-masaje-para-2/3061";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        context.startActivity(i);
                    }
                })
                .show();
    }

    public static void showDiscountDialog(final Context context){

        new MaterialDialog.Builder(context)
                .customView(R.layout.dialog_discount, true)
                .positiveText("Hecho!")
                .show();
    }


    public static void showDailyTipDialog(final Context context){

        new MaterialDialog.Builder(context)
                .title("Consejo")
                .positiveText("Hecho!")
                .content(TipManager.getRandomDailyTip(context))
                .show();
    }
}
