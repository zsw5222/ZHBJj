package com.example.chmanw.zhbj;

import android.app.Application;
import android.content.Context;

/**
 * Created by CHManW on 17/7/31.
 */

public class MyApplication extends Application {

    private  static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }
}
