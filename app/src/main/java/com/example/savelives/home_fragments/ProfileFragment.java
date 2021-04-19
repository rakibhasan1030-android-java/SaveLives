package com.example.savelives.home_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.R;
import com.example.savelives.adapters.ProfileRecyclerViewAdapter;
import com.example.savelives.models.ProfileBadgesPOJO;
import com.example.savelives.models.ProfileInfoPOJO;
import com.example.savelives.models.ProfilePOJO;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    List<ProfilePOJO> profileInfoList;
    RecyclerView profileRv;
    ProfileRecyclerViewAdapter profileRecyclerViewAdapter;
    Context mContext;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        mContext = getActivity().getApplicationContext();

        profileRv = view.findViewById(R.id.profile_fragment_rv);
        profileInfoList = new ArrayList<>();
        profileInfoList.add(new ProfileInfoPOJO(getString(R.string.lorum_ipsum_description),
                R.drawable.donation_image, R.drawable.donation_image,
                R.drawable.donation_image, 15));

        profileInfoList.add(new ProfileBadgesPOJO(R.drawable.donation_image,R.drawable.donation_image,R.drawable.donation_image,R.drawable.donation_image,
                R.drawable.donation_image,R.drawable.donation_image,R.drawable.donation_image,R.drawable.donation_image));

        configureProfileRecyclerViewAdapter(view, profileInfoList);

        return view;
    }


    private void configureProfileRecyclerViewAdapter(View view, List<ProfilePOJO> profileInfoList) {

        profileRecyclerViewAdapter = new ProfileRecyclerViewAdapter(profileInfoList, mContext);
        profileRv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        profileRv.setAdapter(profileRecyclerViewAdapter);
        profileRv.setHasFixedSize(true);

    }


}