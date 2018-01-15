package com.example.user.retrofitlogin.retrofit2api;


import com.example.user.retrofitlogin.UserLoginReq;
import com.example.user.retrofitlogin.UserRegReq;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by suresh on 13/10/17.
 */
public interface ApiInterface {

    @POST("userSignup")
    Call<UserRegReq> finregister(@Body UserRegReq userRegReq);

    @POST("login")
    Call<UserLoginReq> finLogin(@Body UserLoginReq userRegReq);

    /*@GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/

}
