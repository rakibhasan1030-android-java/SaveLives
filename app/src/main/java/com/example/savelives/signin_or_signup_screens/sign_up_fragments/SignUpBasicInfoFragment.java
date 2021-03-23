package com.example.savelives.signin_or_signup_screens.sign_up_fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.R;
import com.example.savelives.models.SignUpInfoPOJO;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpBasicInfoFragment extends Fragment {

    //views
    TextInputEditText userNameEt, emailEt, passwordEt;

    AppCompatButton basicNextBtn;
    Fragment contactFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;


    public SignUpBasicInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_basic_info, container, false);

        contactFragment =  new SignUpContactInfoFragment();
        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();

        userNameEt = view.findViewById(R.id.basic_info_fragment_username_et);
        emailEt = view.findViewById(R.id.basic_info_fragment_email_et);
        passwordEt = view.findViewById(R.id.basic_info_fragment_password_et);
        basicNextBtn = view.findViewById(R.id.basic_info_fragment_next_button);


        basicNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting user input
                if (userNameEt.getText().length() == 0){

                }else {
                    String userName = userNameEt.getText().toString().trim();
                    //set value to the pojo
                    signUpInfoPOJO.setUserName(userName);
                }
                if (emailEt.getText().length() == 0){

                }else {
                    String email = emailEt.getText().toString().trim();
                    signUpInfoPOJO.setEmail(email);
                }
                if (passwordEt.getText().length() == 0){

                }else {
                    String password = passwordEt.getText().toString().trim();
                    signUpInfoPOJO.setPassword(password);
                }

                //send data to the contact fragment
                bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                contactFragment.setArguments(bundle);

                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.signup_fragments_container, contactFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}