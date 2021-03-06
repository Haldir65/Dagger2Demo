package com.me.harris.dagger2demo.injector.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    SharedPreferences providesSharedPreference(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
