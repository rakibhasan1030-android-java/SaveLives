package com.example.savelives.home_menu_requests_views.home_menu_container_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.example.savelives.R;
import com.example.savelives.home_menu_requests_views.home_menu_fragments.DonationFragment;
import com.example.savelives.home_menu_requests_views.home_menu_fragments.DonorFragment;
import com.example.savelives.home_menu_requests_views.home_menu_fragments.MyListFragment;
import com.example.savelives.home_menu_requests_views.home_requests_fragments.MyRequestFragment;
import com.example.savelives.home_menu_requests_views.home_requests_fragments.PostRequestFragment;
import com.example.savelives.home_menu_requests_views.home_requests_fragments.UrgentRequestFragment;
import com.example.savelives.utils.Credentials;

public class HomeMenuActivity extends AppCompatActivity {

    String fragment_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        fragment_name = getIntent().getStringExtra("FRAGMENT_NAME");


        if (fragment_name != null) {

            FragmentManager fragmentManager = this.getSupportFragmentManager();

            if (fragment_name.equals(Credentials.DONATION_FRAGMENT)){
                Fragment fragment = new DonationFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }else if (fragment_name.equals(Credentials.DONOR_FRAGMENT)){
                Fragment fragment = new DonorFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }else if (fragment_name.equals(Credentials.MY_LIST_FRAGMENT)){
                Fragment fragment = new MyListFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }else if (fragment_name.equals(Credentials.URGENT_REQUEST_FRAGMENT)){
                Fragment fragment = new UrgentRequestFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }else if (fragment_name.equals(Credentials.MY_REQUEST_FRAGMENT)){
                Fragment fragment = new MyRequestFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }else if (fragment_name.equals(Credentials.POST_REQUEST_FRAGMENT)){
                Fragment fragment = new PostRequestFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_menu_container, fragment)
                        .commit();
            }

        } else {
            Log.v("TAG", "Error in creating Fragments!");
        }

    }


}