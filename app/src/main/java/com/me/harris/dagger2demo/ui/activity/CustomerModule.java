package com.me.harris.dagger2demo.ui.activity;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fermi on 2018/3/21.
 */



@Module
public class CustomerModule {

    String mName;
    int Id ;

    @Inject
    public CustomerModule(String mName, int id) {
        this.mName = mName;
        Id = id;
    }



    @Provides
    String provideName() {
        return mName;
    }

    @Provides
    int provideId(){
        return Id;
    }
}
