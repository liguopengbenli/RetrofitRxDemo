package com.lig.intermediate.demoretrofitrxjava.service;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit = null ;
    private static String BASE_URL =  "https://jsonplaceholder.typicode.com/";

    private static PostAppService getService(){

        if(retrofit==null){

            retrofit = new Retrofit.Builder()
                                    .baseUrl(BASE_URL)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return retrofit.create(PostAppService.class);
    }

}
