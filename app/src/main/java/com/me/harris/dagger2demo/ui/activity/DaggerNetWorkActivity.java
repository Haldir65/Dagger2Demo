package com.me.harris.dagger2demo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.databinding.ActivityDaggerNetworkDemoBinding;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerNetWorkActivity extends AppCompatActivity {
    ActivityDaggerNetworkDemoBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_network_demo);
    }
}
