package com.me.harris.dagger2demo;

import android.app.Application;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * Created by Fermi on 2016/9/25.
 */

public class App extends Application {


    @Inject
    OkHttpClient client;

    @Override
    public void onCreate() {
        super.onCreate();


    }

}
