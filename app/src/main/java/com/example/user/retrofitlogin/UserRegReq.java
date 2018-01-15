package com.example.user.retrofitlogin;

import com.google.gson.annotations.SerializedName;

/**
 * Created by suresh on 16/5/17.
 */
public class UserRegReq {

    //String user_name, first_name, last_name, email, password, phone_number, coupon_code;

    public UserRegReq(String krish, String kannar, String s,
                      String s1, String s2, String fst101) {
        // user_name = kannan;
        first_name = krish;
        last_name = kannar;
        email = s;
        password =s1;
        phone_number = s2;
        coupon_code = fst101;
    }

    @SerializedName("first_name")
    public String first_name;

    @SerializedName("last_name")
    public String last_name;

    @SerializedName("email")
    public String email;

    @SerializedName("password")
    public String password;

    @SerializedName("phone_number")
    public String phone_number;

    @SerializedName("coupon_code")
    public String coupon_code;

    @SerializedName("status")
    public String status;

    @SerializedName("msg")
    public String msg;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
