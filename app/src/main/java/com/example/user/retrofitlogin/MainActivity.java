package com.example.user.retrofitlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.retrofitlogin.retrofit2api.ApiClient;
import com.example.user.retrofitlogin.retrofit2api.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText EName, EPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EName = (EditText) findViewById(R.id.editname);
        EPassword = (EditText) findViewById(R.id.editpassword);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);

                Call<UserLoginReq> call = apiService.finLogin(new
                        UserLoginReq("hee@gmail.com", "four"));

                call.enqueue(new Callback<UserLoginReq>() {
                    @Override
                    public void onResponse(Call<UserLoginReq> call,
                                           Response<UserLoginReq> response) {
                        String ss = response.body().token;
                        // String de = response.body().details.email;

                        Log.d("Token", ss);

                    }

                    @Override
                    public void onFailure(Call<UserLoginReq> call, Throwable t) {

                        Log.d("onfailure", t.toString());


                    }
                });


            }
        });
    }
}
