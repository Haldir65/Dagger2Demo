package com.me.harris.dagger2demo.model;

import javax.inject.Inject;

import dagger.Module;

/**
 * Created by Harris on 2018/3/21.
 */

public class User {

    public String name;
    public int id;

    @Inject
    public User() {
        this.name = "my Name";
        this.id = 100;
    }
}
