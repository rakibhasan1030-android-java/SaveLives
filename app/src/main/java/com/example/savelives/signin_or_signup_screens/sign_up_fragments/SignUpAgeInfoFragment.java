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
import com.example.savelives.models.MonthNames;
import com.example.savelives.models.SignUpInfoPOJO;
import com.shawnlin.numberpicker.NumberPicker;


public class SignUpAgeInfoFragment extends Fragment {

    NumberPicker ageNp,dayNp, monthNp;

    AppCompatButton ageNextButton;
    Fragment userImageFragment;
    Bundle bundle;
    SignUpInfoPOJO signUpInfoPOJO;



    public SignUpAgeInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_age_info, container, false);

        ageNextButton = view.findViewById(R.id.age_info_fragment_next_button);
        ageNp = view.findViewById(R.id.age_picker);
        dayNp = view.findViewById(R.id.day_picker);
        monthNp = view.findViewById(R.id.month_picker);

        setMonthAtMonthPicker(monthNp);

        bundle = new Bundle();
        signUpInfoPOJO = new SignUpInfoPOJO();
        userImageFragment = new SignUpUserImageInfoFragment();

        signUpInfoPOJO = getDataFromPreviousFragment(signUpInfoPOJO, bundle);

        ageNp.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               signUpInfoPOJO.setAge(newVal);
            }
        });

        dayNp.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                signUpInfoPOJO.setDateOfBirthDay(newVal);
            }
        });

        monthNp.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                signUpInfoPOJO.setDateOfBirthMonth(MonthNames.getMonthNamesArrayList().get(newVal).getName());
            }
        });

        ageNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //send data to the userImage fragment
                bundle.putSerializable("USER_INFO", signUpInfoPOJO);
                userImageFragment.setArguments(bundle);

                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.signup_fragments_container, userImageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;

    }


    private void setMonthAtMonthPicker(NumberPicker monthPicker) {
        MonthNames.initMonths();
        monthPicker.setMaxValue(MonthNames.getMonthNamesArrayList().size()-1);
        monthPicker.setMinValue(0);
        monthPicker.setDisplayedValues(MonthNames.allMonthNames());
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