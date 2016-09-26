package com.me.harris.dagger2demo.injector.components;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.injector.modules.ApiModule;
import com.me.harris.dagger2demo.injector.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Fermi on 2016/9/25.
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class})
public interface AppComponent {
    OkHttpClient getClient();

    Retrofit getRetrofit();

    Gson getGson();

    Cache getCahce();

    SharedPreferences getSharedPreference();

    void Inject(App app);




}
