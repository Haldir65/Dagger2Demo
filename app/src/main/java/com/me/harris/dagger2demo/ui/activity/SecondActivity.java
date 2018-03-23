package com.me.harris.dagger2demo.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.injector.components.CustomerComponet;
import com.me.harris.dagger2demo.injector.components.DaggerCustomerComponet;
import com.me.harris.dagger2demo.injector.modules.CustomerModule;
import com.me.harris.dagger2demo.model.Customer;

import javax.inject.Inject;

/**
 * Created by Fermi on 2018/3/21.
 */

public class SecondActivity extends AppCompatActivity {

    Button mButton;

    @Inject
    Customer mCustomer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButton = findViewById(R.id.button);
        CustomerComponet customerComponet = DaggerCustomerComponet.builder().
                customerModule(new CustomerModule("John",1)).build();
        customerComponet.Inject(this);
        Customer customer = customerComponet.eject();

    }
}
