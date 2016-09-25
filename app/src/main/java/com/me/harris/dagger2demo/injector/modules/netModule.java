package com.me.harris.dagger2demo.injector.modules;

import android.content.SharedPreferences;

import dagger.Module;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class netModule {
    String mBaseUrl;

    public netModule(String mBaseUrl) {
        this.mBaseUrl = mBaseUrl;
    }

    SharedPreferences p
}
