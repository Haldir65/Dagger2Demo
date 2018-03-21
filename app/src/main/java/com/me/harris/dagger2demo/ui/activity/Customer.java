package com.me.harris.dagger2demo.ui.activity;

import javax.inject.Inject;

/**
 * Created by Fermi on 2018/3/21.
 */


public class Customer {

    String name;
    int Id;

    @Inject
    public Customer(String name,int id) {
        this.name = name;
        this.Id = id;
    }

    public Customer() {
    }
}
