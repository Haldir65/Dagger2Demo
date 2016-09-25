package com.me.harris.dagger2demo.injector.modules;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class ActivityModule {

   @Provides UserModel provideUserModle(){
        return new UserModel();
    }
}
