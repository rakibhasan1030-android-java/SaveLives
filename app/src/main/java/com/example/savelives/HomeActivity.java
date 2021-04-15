package com.example.savelives;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.savelives.home_fragments.HomeFragment;
import com.example.savelives.home_fragments.MapFragment;
import com.example.savelives.home_fragments.NotificationsFragment;
import com.example.savelives.home_fragments.ProfileFragment;
import com.example.savelives.models.SignUpInfoPOJO;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeActivity extends AppCompatActivity {

    ChipNavigationBar navigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get data from sign_up fragments
       // signUpInfoPOJO = (SignUpInfoPOJO) getIntent().getSerializableExtra("USER_INFO");
        navigationBar = findViewById(R.id.home_bottom_nav_bar);
        if (savedInstanceState==null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.home_fragment_container, new HomeFragment())
                    .commit();
            navigationBar.setItemSelected(R.id.home, true);
        }
        configureNavigationBar(navigationBar);

       // Log.v("USER_INFO", signUpInfoPOJO.toString());

    }

    private void configureNavigationBar(ChipNavigationBar navigationBar) {

        navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;

                switch (id){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.map:
                        fragment = new MapFragment();
                        break;
                    case R.id.notifications:
                        fragment = new NotificationsFragment();
                        break;
                    case R.id.profile:
                        fragment = new ProfileFragment();
                        break;
                }
                if (fragment != null){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.home_fragment_container, fragment)
                            .commit();
                }else {
                    Log.v("TAG", "Error in creating Fragments!");
                }
            }
        });

    }


}