package com.example.savelives.signin_or_signup_screens.sign_up_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.HomeActivity;
import com.example.savelives.R;
import com.example.savelives.home_fragments.ProfileFragment;
import com.example.savelives.models.SignUpInfoPOJO;

public class SignUpUserImageInfoFragment extends Fragment {

    AppCompatButton userImageStartJourneyButton, imageUploadButton;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;
    Fragment profileFragment;

    public SignUpUserImageInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_user_image_info, container, false);

        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();
        profileFragment = new ProfileFragment();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        userImageStartJourneyButton = view.findViewById(R.id.user_image_info_fragment_next_button);
        imageUploadButton = view.findViewById(R.id.user_image_info_fragment_upload_button);

        userImageStartJourneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = imageUploadButton.getId();
                signUpInfoPOJO.setUserAvatar(String.valueOf(id));
                bundle.putString("USER_INFO", "");
                profileFragment.setArguments(bundle);

                //send data to the contact fragment
                bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                startActivity(new Intent(getContext(), HomeActivity.class).putExtra("USER_INFO", signUpInfoPOJO));



            }
        });

        return view;
    }


    private SignUpInfoPOJO getDataFromPreviousFragment(SignUpInfoPOJO signUpInfoPOJO, Bundle bundle) {

        bundle = getArguments();
        if (bundle != null){
            signUpInfoPOJO = (SignUpInfoPOJO) bundle.getSerializable("USER_INFO");
        }else {
            Log.v("USER_INFO", "Bundle is NULL!");
        }

        return signUpInfoPOJO;
    }


}