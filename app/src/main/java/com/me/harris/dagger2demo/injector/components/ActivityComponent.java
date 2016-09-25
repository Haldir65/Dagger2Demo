package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.ActivityModule;
import com.me.harris.dagger2demo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Fermi on 2016/9/25.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
