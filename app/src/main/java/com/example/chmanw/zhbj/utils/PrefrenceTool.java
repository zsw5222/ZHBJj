package com.example.chmanw.zhbj.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.example.chmanw.zhbj.MyApplication;



public class PrefrenceTool {

    public  static final String IS_FIRST_LAUNCH = "is_first_launch";

    @SuppressLint("CommitPrefEdits")
    public  static void setBoolen(boolean value, String key){

         MyApplication.getmContext().getSharedPreferences("data", Context.MODE_PRIVATE).edit().putBoolean(key,value);
    }
    
    public  static  boolean getBoolen(String key ,boolean defalut){
        
      return   MyApplication.getmContext().getSharedPreferences("data",Context.MODE_PRIVATE).getBoolean(key,defalut);
    }

}
