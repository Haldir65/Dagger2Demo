package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.UseModelModule;
import com.me.harris.dagger2demo.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fermi on 2016/9/25.
 */

@Singleton
@Component(modules = {UseModelModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);

}
