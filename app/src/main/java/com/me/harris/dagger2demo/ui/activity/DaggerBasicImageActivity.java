package com.me.harris.dagger2demo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.databinding.ActivityDaggerBasicImageBinding;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerBasicImageActivity extends AppCompatActivity {
    ActivityDaggerBasicImageBinding binding;

    @Inject
    Retrofit retrofit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_basic_image);
        ((App) getApplication()).getmAppcomponent().inject(this);
    }
}
