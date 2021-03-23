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

public class SignUpWeightInfoFragment extends Fragment {

    //views
    ToggleButtonGroupTableLayout weightTB;
    RadioButton weightRB;

    AppCompatButton weightNextBtn;
    Fragment genderFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;

    public SignUpWeightInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_weight_info, container, false);

        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();
        genderFragment = new SignUpGenderInfoFragment();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        weightTB = view.findViewById(R.id.weight_info_fragment_toggle_button);
        weightNextBtn = view.findViewById(R.id.weight_info_fragment_next_button);

        weightNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting user input
                int checkedButtonId = weightTB.getCheckedRBId();

                if (checkedButtonId != 0){
                    weightRB = view.findViewById(checkedButtonId);
                    String weight = weightRB.getText().toString();
                    if (weight.equals(getResources().getString(R.string.greater_than_50))){
                        signUpInfoPOJO.setWeightAboveFiftyKg(true);
                    }else{
                        signUpInfoPOJO.setWeightAboveFiftyKg(false);
                    }

                    //send data to the gender fragment
                    bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                    genderFragment.setArguments(bundle);


                    assert getFragmentManager() != null;
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.signup_fragments_container, genderFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else {
                    Toast.makeText(getActivity(),"Please, select your weight",Toast.LENGTH_SHORT).show();
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