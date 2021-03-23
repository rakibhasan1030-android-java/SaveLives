package com.example.savelives.signin_or_signup_screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.savelives.R;
import com.example.savelives.signin_or_signup_screens.sign_up_fragments.SignUpBasicInfoFragment;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.signup_fragments_container, new SignUpBasicInfoFragment());
        ft.commit();
    }
}