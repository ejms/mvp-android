package com.valmaraz.mvp.view;

import android.app.Application;

import com.valmaraz.mvp.Environment;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Environment.configure();
    }
}
