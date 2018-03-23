package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.HttpModule;
import com.me.harris.dagger2demo.injector.modules.UserModule;
import com.me.harris.dagger2demo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Harris on 2018/3/21.
 */

@Component(modules = {HttpModule.class, UserModule.class})
public interface HttpComponent {

    void Inject(MainActivity activity);



}
