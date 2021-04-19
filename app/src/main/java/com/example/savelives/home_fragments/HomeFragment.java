package com.example.savelives.home_fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.savelives.BloodDonationRecyclerViewAdapter;
import com.example.savelives.R;
import com.example.savelives.home_menu_requests_views.home_menu_container_activity.HomeMenuActivity;
import com.example.savelives.models.BloodCampaignInfoPOJO;
import com.example.savelives.utils.Credentials;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    List<BloodCampaignInfoPOJO> campaignInfoList;
    RecyclerView bloodCampaignRV;

    ImageView donationIV, donorIV, myListIV, urgentRequestIV, myRequestIV, postRequestIV;

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
        donationIV = view.findViewById(R.id.donation_iv);
        donorIV = view.findViewById(R.id.donor_iv);
        myListIV = view.findViewById(R.id.my_list_iv);
        urgentRequestIV = view.findViewById(R.id.urgent_request_iv);
        myRequestIV = view.findViewById(R.id.my_request_iv);
        postRequestIV = view.findViewById(R.id.post_request_iv);


        campaignInfoList = new ArrayList<>();
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));
        campaignInfoList.add(new BloodCampaignInfoPOJO(getString(R.string.blood_donation_campaign), getString(R.string.by_admin), getString(R.string.one_min_ago), R.drawable.blood_donation_campaign_cover));
        configureBloodDonationRecyclerViewAdapter(view, campaignInfoList);


        donationIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.DONATION_FRAGMENT));
            }
        });
        donorIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.DONOR_FRAGMENT));
            }
        });
        myListIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.MY_LIST_FRAGMENT));
            }
        });
        urgentRequestIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.URGENT_REQUEST_FRAGMENT));
            }
        });
        myRequestIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.MY_REQUEST_FRAGMENT));
            }
        });
        postRequestIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeMenuActivity.class).putExtra("FRAGMENT_NAME", Credentials.POST_REQUEST_FRAGMENT));
            }
        });


        return view;

    }


    private void configureBloodDonationRecyclerViewAdapter(View view, List<BloodCampaignInfoPOJO> campaignInfoList) {
        bloodDonationRecyclerViewAdapter = new BloodDonationRecyclerViewAdapter(campaignInfoList);
        bloodCampaignRV.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        bloodCampaignRV.setAdapter(bloodDonationRecyclerViewAdapter);
    }


}