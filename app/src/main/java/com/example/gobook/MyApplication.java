package com.example.gobook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getAppContext());

    }

    public static Context getAppContext(){

        return myApplication.getApplicationContext();
    }


    public static SharedPreferences getSharedPreferences(){

        return sharedPreferences;
    }


}

