package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.injector.modules.ApiModule;
import com.me.harris.dagger2demo.injector.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fermi on 2016/9/25.
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class})
public interface AppComponent {
    void inject(App app);
}
