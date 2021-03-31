package com.example.savelives.splash_screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.savelives.R;
import com.example.savelives.signin_or_signup_screens.SignInActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {


    Context mContext;

    private SwipeDisabledViewPager viewPager;
    private SplashActivityViewPagerAdapter splashActivityViewPagerAdapter;

    List<SplashScreenItemPOJO> list;


    TabLayout tabIndicator;
    AppCompatButton nextButton;
    Animation buttonAnimation;
    int position = 0;

    ImageView bloodDonationLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext = getApplicationContext();

        //if the user is existing the page will derive to the login page
        if (restoreExistingData()){
            startActivity(new Intent(mContext, SignInActivity.class));
            finish();
        }


        tabIndicator = findViewById(R.id.ss_tab_layout);
        nextButton = findViewById(R.id.splash_activity_button);
        bloodDonationLogo = findViewById(R.id.splash_activity_blood_donation_logo);
        buttonAnimation = AnimationUtils.loadAnimation(mContext, R.anim.button_animation);

        list = new ArrayList<>();
        list.add(new SplashScreenItemPOJO(R.drawable.ss_first_image, R.drawable.ss_blood_drop_image_white, R.string.donate_blood, R.string.lorum_ipsum_description));
        list.add(new SplashScreenItemPOJO(R.drawable.ss_second_image, R.drawable.ss_blood_drop_image_white, R.string.save_life, R.string.lorum_ipsum_description));

        viewPager = findViewById(R.id.splash_activity_view_pager);

        splashActivityViewPagerAdapter = new SplashActivityViewPagerAdapter(mContext, list);
        viewPager.setAdapter(splashActivityViewPagerAdapter);
        tabIndicator.setupWithViewPager(viewPager);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String buttonText = nextButton.getText().toString();

                if (buttonText.equals(getResources().getString(R.string.next))){
                    position = viewPager.getCurrentItem();
                   // Log.v("PPP", String.valueOf(list.size()));
                   // Log.v("PPP", String.valueOf(viewPager.getCurrentItem()));

                    if (position < list.size() -1 ){
                        position++;
                        viewPager.setCurrentItem(position);
                    }else{
                        Log.v("PPP", "loadLastScreen");
                        loadLastScreen();
                    }
                }else if (buttonText.equals(getResources().getString(R.string.start_journey))){
                    startActivity(new Intent(mContext, SignInActivity.class));
                    saveExistingUser();
                }

            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (position < list.size() - 1){
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private boolean restoreExistingData() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences("ExistingUser", MODE_PRIVATE);
        Boolean isUserExiting = sharedPreferences.getBoolean("isExistingUser", false);
        return isUserExiting;
    }

    private void saveExistingUser() {
        SharedPreferences sharedPreferences = getSharedPreferences("ExistingUser", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isExistingUser", true);
        editor.apply();
        finish();
    }

    private void loadLastScreen() {
        nextButton.setText(R.string.start_journey);
        nextButton.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_button_bg_red);
        nextButton.setAnimation(buttonAnimation);
        nextButton.setTextColor(getResources().getColor(R.color.white));
        viewPager.setVisibility(View.INVISIBLE);
        bloodDonationLogo.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
    }


}