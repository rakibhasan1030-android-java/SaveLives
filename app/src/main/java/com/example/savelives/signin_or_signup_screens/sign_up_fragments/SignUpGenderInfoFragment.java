package com.example.savelives.signin_or_signup_screens.sign_up_fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.savelives.R;
import com.example.savelives.models.SignUpInfoPOJO;

public class SignUpGenderInfoFragment extends Fragment {


    ToggleButtonGroupTableLayout genderTB;
    RadioButton genderRB;

    AppCompatButton genderNextBtn;
    Fragment addressFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;

    public SignUpGenderInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_gender_info, container, false);

        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();
        addressFragment = new SignUpAddressInfoFragment();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        genderTB = view.findViewById(R.id.gender_info_fragment_toggle_button);
        genderNextBtn = view.findViewById(R.id.gender_info_fragment_next_button);

        genderNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //getting user input
                int checkedButtonId = genderTB.getCheckedRBId();

                if (checkedButtonId != 0){
                    genderRB = view.findViewById(checkedButtonId);
                    String gender = genderRB.getText().toString();

                    signUpInfoPOJO.setGender(gender);

                    //send data to the gender fragment
                    bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                    addressFragment.setArguments(bundle);

                    assert getFragmentManager() != null;
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.signup_fragments_container, addressFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else {
                    Toast.makeText(getActivity(),"Please, select your gender",Toast.LENGTH_SHORT).show();
                }

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