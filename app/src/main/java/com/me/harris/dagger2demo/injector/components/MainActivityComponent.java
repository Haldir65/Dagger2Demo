package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.HttpModule;
import com.me.harris.dagger2demo.model.User;
import com.me.harris.dagger2demo.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Harris on 2018/3/21.
 */

@Component(dependencies = HttpComponent.class,modules = HttpModule.class)
public interface MainActivityComponent {

    @Singleton
    User user();

    void inject(MainActivity activity);

}
