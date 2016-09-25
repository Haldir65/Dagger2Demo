package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.AppModule;
import com.me.harris.dagger2demo.injector.modules.NetModule;
import com.me.harris.dagger2demo.ui.activity.DaggerBasicImageActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fermi on 2016/9/25.
 */
@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface AppComponent {
    void inject(DaggerBasicImageActivity activity);

}