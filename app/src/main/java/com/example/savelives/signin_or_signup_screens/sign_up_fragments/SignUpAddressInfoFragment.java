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

import java.util.Objects;

public class SignUpAddressInfoFragment extends Fragment {


    //views
    TextInputEditText streetAddressEt, cityEt, postalCodeEt;


    AppCompatButton addressNextBtn;
    Fragment ageFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;

    public SignUpAddressInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_address_info, container, false);


        ageFragment = new SignUpAgeInfoFragment();
        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        streetAddressEt = view.findViewById(R.id.address_info_fragment_street_address);
        cityEt = view.findViewById(R.id.address_info_fragment_city);
        postalCodeEt = view.findViewById(R.id.address_info_fragment_postal_code);
        addressNextBtn = view.findViewById(R.id.address_info_fragment_next_button);
        ageFragment =  new SignUpAgeInfoFragment();

        addressNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //getting user input
                if (Objects.requireNonNull(streetAddressEt.getText()).length() == 0){

                }else {
                    String streetAddress = streetAddressEt.getText().toString().trim();
                    //set value to the pojo
                    signUpInfoPOJO.setStreetAddress(streetAddress);
                }
                if (Objects.requireNonNull(cityEt.getText()).length() == 0){

                }else {
                    String city = cityEt.getText().toString().trim();
                    signUpInfoPOJO.setCity(city);
                }
                if (Objects.requireNonNull(postalCodeEt.getText()).length() == 0){

                }else {
                    String postalCode = postalCodeEt.getText().toString().trim();
                    signUpInfoPOJO.setPostal_code(Integer.parseInt(postalCode));
                }

                //send data to the contact fragment
                bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                ageFragment.setArguments(bundle);

                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.signup_fragments_container, ageFragment);
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