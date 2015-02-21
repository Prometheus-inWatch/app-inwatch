package com.prometheus.quitsmoking;

import android.content.Context;

import java.util.Random;

/**
 * Created by david on 21/2/15.
 */
public class TipManager {

    public static String getRandomTip(Context context){

        Random number = new Random();
        int nTip = number.nextInt(100);

        int id = context.getResources().getIdentifier("tip_no"+String.format("%03d",nTip),"string",context.getPackageName());
        return context.getResources().getString(id);
    }
}
