package com.rh.developstandard.utils;

import android.widget.Toast;

import com.rh.developstandard.global.MyApplocation;

/**
 * Created by admin on 2016/12/5.
 */

public class ToastUtil {

    public static Toast toast;

    public static void showToast(String text) {
        if (null == text) {
            toast = Toast.makeText(MyApplocation.context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
            toast.show();
        }
    }

}
