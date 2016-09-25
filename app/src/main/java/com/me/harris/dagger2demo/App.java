package com.me.harris.dagger2demo;

import android.app.Application;

import com.me.harris.dagger2demo.injector.components.AppComponent;
import com.me.harris.dagger2demo.injector.components.DaggerAppComponent;
import com.me.harris.dagger2demo.injector.modules.AppModule;
import com.me.harris.dagger2demo.injector.modules.NetModule;
import com.me.harris.dagger2demo.util.Constants;

/**
 * Created by Fermi on 2016/9/25.
 */

public class App extends Application {

    private AppComponent mAppcomponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppcomponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(Constants.BASE_URL)).build();

    }

    public AppComponent getmAppcomponent() {
        return mAppcomponent;
    }
}
