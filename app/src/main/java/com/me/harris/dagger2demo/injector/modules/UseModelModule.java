package com.me.harris.dagger2demo.injector.modules;

import com.me.harris.dagger2demo.model.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fermi on 2016/9/25.
 */

@Module
public class UseModelModule {

   @Provides
   UserModel provideUserModel(){
        return new UserModel();
    }
}
