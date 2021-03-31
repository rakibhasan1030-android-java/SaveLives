package com.example.savelives.home_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.BloodDonationRecyclerViewAdapter;
import com.example.savelives.R;
import com.example.savelives.models.BloodCampaignInfoPOJO;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    List<BloodCampaignInfoPOJO> campaignInfoList;
    RecyclerView bloodCampaignRV;

    BloodDonationRecyclerViewAdapter bloodDonationRecyclerViewAdapter;

    Context mContext;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        mContext = getActivity().getApplicationContext();


        bloodCampaignRV = view.findViewById(R.id.home_fragment_blood_donation_campaign_rv);

        campaignInfoList = new ArrayList<>();
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));

        configureCastRecyclerViewAdapter(view, campaignInfoList);

        return view;

    }


    private void configureCastRecyclerViewAdapter(View view, List<BloodCampaignInfoPOJO> campaignInfoList) {
        bloodDonationRecyclerViewAdapter = new BloodDonationRecyclerViewAdapter(campaignInfoList);
        bloodCampaignRV.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        bloodCampaignRV.setAdapter(bloodDonationRecyclerViewAdapter);
    }



}