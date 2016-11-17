package com.keyi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends Activity {
    public static final String API_BASE_URL = "http://gank.io/api/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        GitHubService gitHubService = ServiceGenerator.getInstance(API_BASE_URL).createService(GitHubService.class);
//        Call<Endpoints> endpointsCall = gitHubService.getAllEndpoints("");
//        endpointsCall.enqueue(new Callback<Endpoints>() {
//            @Override
//            public void onResponse(Call<Endpoints> call, Response<Endpoints> response) {
//                Endpoints endpoints = response.body();
//                String repositoryUrl = endpoints.getRepository_url();
//                Log.e("repository url:",repositoryUrl);
//                Toast.makeText(MainActivity.this, "repository url: " + repositoryUrl, Toast.LENGTH_LONG).show();
//            }
//            @Override
//            public void onFailure(Call<Endpoints> call, Throwable t) {
//
//            }
//        });

//        UserService userService=  ServiceGenerator.getInstance(API_BASE_URL).createService(UserService.class);
//        Call<User> userCall=userService.getUser("休息视频","10","1");
//        userCall.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                User user=response.body();
//                Log.e("string", call.request().url().toString());
//                Log.e("string",   response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//                Log.e("asdasd",call.toString());
//            }
//        });

        UserService userService=  ServiceGenerator.getInstance(API_BASE_URL).createService(UserService.class);
        userService.getUser("休息视频","10","1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<User>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(User user) {
                        Log.e("string", user.getResults().get(0).getUrl().toString());
                    }
                });
        }
}

