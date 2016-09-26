package com.me.harris.dagger2demo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.databinding.ActivityDaggerBasicImageBinding;
import com.me.harris.dagger2demo.injector.components.ActivityComponent;
import com.me.harris.dagger2demo.injector.components.DaggerActivityComponent;
import com.me.harris.dagger2demo.model.UserModel;

import javax.inject.Inject;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerBasicImageActivity extends AppCompatActivity {
    ActivityDaggerBasicImageBinding binding;



    @Inject
    UserModel client;

    ActivityComponent mActivityComponent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_basic_image);
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(((App) getApplication()).getmAppcomponent())
                .build();
        mActivityComponent.inject(this);
       /* restService service = retrofit.create(restService.class);
        Call<FuLi> call = service.getFuli(10, 1);
        call.enqueue(new Callback<FuLi>() {
            @Override
            public void onResponse(Call<FuLi> call, Response<FuLi> response) {
                FuLi fuLi = response.body();
                News news = fuLi.getResults().get(3);
                binding.setNews(news);
            }

            @Override
            public void onFailure(Call<FuLi> call, Throwable t) {

            }
        });*/




    }


}
