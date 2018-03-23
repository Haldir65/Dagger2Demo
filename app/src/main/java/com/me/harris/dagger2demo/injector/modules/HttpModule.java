package com.me.harris.dagger2demo.injector.modules;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Harris on 2018/3/21.
 */

@Module
public class HttpModule {

//    String mBaseUrl;
//
//    public HttpModule(String mBaseUrl) {
//        this.mBaseUrl = mBaseUrl;
//    }
//
//
//
//    @Provides
//    @Singleton
//    Gson provideGson() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//        return gsonBuilder.create();
//    }

    @Provides
    OkHttpClient Client() {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        return client.build();
    }

//    @Provides
//    @Singleton
//    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
//        return new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .baseUrl(mBaseUrl)
//                .client(okHttpClient)
//                .build();
//    }

}
