package com.example.savelives.signin_or_signup_screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.savelives.HomeActivity;
import com.example.savelives.R;
import com.google.android.material.textfield.TextInputEditText;

public class SignInActivity extends AppCompatActivity {

    Context mContext;
    TextInputEditText emailEt, passEt;
    AppCompatButton signInBtn;
    TextView forgotPassTv, signUpTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mContext = getApplicationContext();


        emailEt = findViewById(R.id.sign_in_activity_email_et);
        passEt = findViewById(R.id.sign_in_activity_pass_et);
        signInBtn = findViewById(R.id.sign_in_activity_sign_in_button);
        forgotPassTv = findViewById(R.id.sign_in_activity_forgot_pass_tv);
        signUpTv = findViewById(R.id.sign_in_activity_sign_up_tv);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, HomeActivity.class));
            }
        });
        signUpTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, SignUpActivity.class));
            }
        });


    }


}