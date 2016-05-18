package com.bipin.android.retrofitdemo.my_interface;

import com.bipin.android.retrofitdemo.pozo.Curator;

import retrofit.http.GET;
import retrofit.http.Query;
 
public interface IApiMethods {
 
    @GET("/get/curators.json")
    Curator getCurators(
            @Query("api_key") String key
    );
}