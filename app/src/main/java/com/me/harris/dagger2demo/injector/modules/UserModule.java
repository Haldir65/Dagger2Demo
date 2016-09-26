package com.me.harris.dagger2demo.injector.modules;

import com.me.harris.dagger2demo.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class UserModule {

    public UserModule(User user) {
        this.user = user;
    }

    User user;

    @Provides
    User provideUserModel() {
        return user;
    }

}
