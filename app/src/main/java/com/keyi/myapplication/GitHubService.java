package com.keyi.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface GitHubService {
    @GET
    Call<Endpoints> getAllEndpoints(@Url String url);
}
