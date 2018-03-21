package com.me.harris.dagger2demo.ui.activity;

import dagger.Component;

/**
 * Created by Fermi on 2018/3/21.
 */

@Component(modules = CustomerModule.class)
public interface CustomerComponet {
    void Inject(SecondActivity activity);



    Customer eject();
}
