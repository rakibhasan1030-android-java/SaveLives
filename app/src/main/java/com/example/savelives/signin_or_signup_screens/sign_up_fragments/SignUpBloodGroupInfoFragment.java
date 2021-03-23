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


public class SignUpBloodGroupInfoFragment extends Fragment {

    //views
    ToggleButtonGroupTableLayout bloodGroupTB;
    RadioButton bloodGroupRB;

    AppCompatButton bloodGroupNextBtn;
    Fragment weightFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;

    public SignUpBloodGroupInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_blood_group_info, container, false);

        weightFragment = new SignUpWeightInfoFragment();
        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);


        bloodGroupTB = view.findViewById(R.id.blood_group_info_fragment_toggle_button);
        bloodGroupNextBtn = view.findViewById(R.id.blood_group_info_fragment_next_button);



        bloodGroupNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bloodGroup = "";
                //getting user input
                int checkedButtonId = bloodGroupTB.getCheckedRBId();

                if (checkedButtonId != 0){

                    bloodGroupRB = view.findViewById(checkedButtonId);
                    bloodGroup = bloodGroupRB.getText().toString();
                    signUpInfoPOJO.setBlood_group(bloodGroup);

                    //send data to the weight fragment
                    bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                    weightFragment.setArguments(bundle);

                    assert getFragmentManager() != null;
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.signup_fragments_container, weightFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else {
                    Toast.makeText(getActivity(),"Please, select your blood group",Toast.LENGTH_SHORT).show();
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