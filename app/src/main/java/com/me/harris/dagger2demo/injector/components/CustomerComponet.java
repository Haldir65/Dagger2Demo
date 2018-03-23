package com.me.harris.dagger2demo.injector.components;

import com.me.harris.dagger2demo.model.Customer;
import com.me.harris.dagger2demo.injector.modules.CustomerModule;
import com.me.harris.dagger2demo.ui.activity.SecondActivity;

import dagger.Component;

/**
 * Created by Fermi on 2018/3/21.
 */

@Component(modules = CustomerModule.class)
public interface CustomerComponet {
    void Inject(SecondActivity activity);



    Customer eject();
}
