package com.me.harris.dagger2demo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.databinding.ActivityDaggerBasicImageBinding;
import com.me.harris.dagger2demo.util.Constants;
import com.me.harris.dagger2demo.util.LogUtil;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerBasicImageActivity extends AppCompatActivity {
    ActivityDaggerBasicImageBinding binding;

    @Inject
    Retrofit retrofit;

    @Inject
    OkHttpClient client;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_basic_image);
        ((App) getApplication()).getmAppcomponent().inject(this);

        Request request = new Request.Builder().
                url(Constants.BASE_URL+"data/福利/10/1").build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                LogUtil.w(response.body().string());

            }
        });

    }
}
