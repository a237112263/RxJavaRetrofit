package com.keyi.myapplication;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/17.
 */
public interface UserService {
    //   http://gank.io/api/data/休息视频/10/1
    @GET("data/{shiping}/{month}/{day}")
    Observable<User> getUser(@Path("shiping") String shiping,@Path("month") String month,@Path("day") String day);
}
