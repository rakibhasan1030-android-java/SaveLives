package com.example.savelives.signin_or_signup_screens.sign_up_fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.R;
import com.example.savelives.models.SignUpInfoPOJO;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpContactInfoFragment extends Fragment {

    //views
    TextInputEditText phoneNumberEt, altPhoneNumberEt, socialEt;


    AppCompatButton contactNextBtn;
    Fragment bloodGroupFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;

    public SignUpContactInfoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_contact_info, container, false);

        bloodGroupFragment = new SignUpBloodGroupInfoFragment();
        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        phoneNumberEt = view.findViewById(R.id.contact_info_fragment_phone_no_et);
        altPhoneNumberEt = view.findViewById(R.id.contact_info_fragment_alt_phone_no_et);
        socialEt = view.findViewById(R.id.contact_info_fragment_social_et);
        contactNextBtn = view.findViewById(R.id.contract_info_fragment_next_button);

        contactNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting user input
                if (phoneNumberEt.getText().length() == 0){

                }else {
                    String phoneNumber = phoneNumberEt.getText().toString().trim();
                    //set value to the pojo
                    signUpInfoPOJO.setPhoneNumber(phoneNumber);
                }
                if (altPhoneNumberEt.getText().length() == 0){

                }else {
                    String altPhoneNumber = altPhoneNumberEt.getText().toString().trim();
                    signUpInfoPOJO.setAltPhoneNumber(altPhoneNumber);
                }
                if (socialEt.getText().length() == 0){

                }else {
                    String social = socialEt.getText().toString().trim();
                    signUpInfoPOJO.setSocial(social);
                }

                //send data to the contact fragment
                bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                bloodGroupFragment.setArguments(bundle);


                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.signup_fragments_container, bloodGroupFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
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