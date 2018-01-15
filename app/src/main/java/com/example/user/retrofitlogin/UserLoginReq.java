package com.example.user.retrofitlogin;

import com.google.gson.annotations.SerializedName;

/**
 * Created by suresh on 8/11/17.
 */
public class UserLoginReq {

    @SerializedName("email")
    public String email;

    @SerializedName("password")
    public String password;

    @SerializedName("status")
    public String status;

    @SerializedName("token")
    public String token;



    public UserLoginReq(String s, String four) {

        this.email = s;
        this.password = four;
    }



}
