package com.me.harris.dagger2demo.injector.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class NetModule {
    String mBaseUrl;

    public NetModule(String mBaseUrl) {
        this.mBaseUrl = mBaseUrl;
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreference(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    Cache provideOkhttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; //10 MiB
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return builder.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient(Cache cache) {
        return new OkHttpClient().newBuilder().cache(cache).build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseUrl)
                .client(client)
                .build();
        return retrofit;
    }
}
