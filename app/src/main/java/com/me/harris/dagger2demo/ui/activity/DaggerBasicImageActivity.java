package com.me.harris.dagger2demo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.api.restService;
import com.me.harris.dagger2demo.databinding.ActivityDaggerBasicImageBinding;
import com.me.harris.dagger2demo.injector.components.ActivityComponent;
import com.me.harris.dagger2demo.injector.components.DaggerActivityComponent;
import com.me.harris.dagger2demo.injector.modules.UserModule;
import com.me.harris.dagger2demo.model.FuLi;
import com.me.harris.dagger2demo.model.News;
import com.me.harris.dagger2demo.model.User;
import com.me.harris.dagger2demo.util.LogUtil;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerBasicImageActivity extends AppCompatActivity {
    ActivityDaggerBasicImageBinding binding;



    @Inject
    User client;

    @Inject
    Retrofit retrofit;

    ActivityComponent mActivityComponent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_basic_image);
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(((App) getApplication()).getmAppcomponent()).
                        userModule(new UserModule(new User(2,"Basic")))
                .build();
        mActivityComponent.inject(this);
        restService service = retrofit.create(restService.class);
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
        });
        LogUtil.w(client.getId() + "" + client.getName());




    }


}
