package com.me.harris.dagger2demo.injector.modules;

import com.me.harris.dagger2demo.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Harris on 2018/3/21.
 */

@Module
public class UserModule {

    @Provides
    User provideUser() {
        return new User();
    }
}
