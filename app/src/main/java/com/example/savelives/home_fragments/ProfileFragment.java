package com.example.savelives.home_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.savelives.R;
import com.example.savelives.models.SignUpInfoPOJO;
import com.loopeer.cardstack.CardStackView;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    CardStackView stackView;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        stackView = view.findViewById(R.id.profile_fragment_csv);


        return  view;
    }


}