package com.example.chmanw.zhbj;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chmanw.zhbj.utils.PrefrenceTool;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        jumpToNextActivity();

                    }
                });
            }
        },2000);
    }

    private void jumpToNextActivity(){

        Intent mIntent;
        if (PrefrenceTool.getBoolen(PrefrenceTool.IS_FIRST_LAUNCH,true)){
            mIntent = new Intent(getApplicationContext(),GuideActivity.class);
        }else {

            mIntent = new Intent(getApplicationContext(),MainActivity.class);
        }
        startActivity(mIntent);
    }
}
