package com.github.magicsih.androidscreencaster;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {


    //    final Handler mHandler = new Handler();
    public static void show(final String info) {
        Utils.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Log.i("show", info);
                Toast t = Toast.makeText(Utils.getApp(), info, Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER, 0, 0);
                t.show();
            }
        });

    }


}
