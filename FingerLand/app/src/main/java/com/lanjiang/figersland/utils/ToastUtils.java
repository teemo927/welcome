package com.lanjiang.figersland.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    private static Toast toast;

    public static void show(Context context, String s) {

        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), s, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            toast.setText(s);
            toast.show();
        }
    }
}
