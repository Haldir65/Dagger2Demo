package com.me.harris.dagger2demo;

import android.app.Application;

import com.me.harris.dagger2demo.injector.components.AppComponent;
import com.me.harris.dagger2demo.injector.components.DaggerAppComponent;
import com.me.harris.dagger2demo.injector.modules.ApiModule;
import com.me.harris.dagger2demo.injector.modules.AppModule;
import com.me.harris.dagger2demo.util.Constants;
import com.me.harris.dagger2demo.util.LogUtil;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * Created by Fermi on 2016/9/25.
 */

public class App extends Application {

    private AppComponent mAppcomponent;

    @Inject
    OkHttpClient client;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppcomponent = DaggerAppComponent
                .builder()
                .apiModule(new ApiModule(Constants.BASE_URL))
                .appModule(new AppModule(this))
                .build();
        LogUtil.w(" 注入之前 client " + client);
        mAppcomponent.Inject(this);
        LogUtil.w("注入之后 client "+client);

    }

    public AppComponent getmAppcomponent() {
        return mAppcomponent;
    }
}
