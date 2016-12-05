package com.rh.developstandard.global;

import android.app.Application;
import android.content.Context;

/**
 * Created by admin on 2016/12/5.
 */

public class MyApplocation extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
