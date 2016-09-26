package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.injector.modules.UserModule;
import com.me.harris.dagger2demo.injector.scope.ActivityScope;
import com.me.harris.dagger2demo.ui.activity.DaggerBasicImageActivity;
import com.me.harris.dagger2demo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Fermi on 2016/9/25.
 */


@ActivityScope
@Component(dependencies = AppComponent.class,modules = UserModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(DaggerBasicImageActivity activity);


}
