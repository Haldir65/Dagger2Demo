package com.me.harris.dagger2demo.api;

import com.me.harris.dagger2demo.model.FuLi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Fermi on 2016/9/25.
 */

public interface RestService {

    @GET("data/福利/{count}/{page}")
    Call<FuLi> getFuli(@Path("count") int count, @Path("page") int page);
}
