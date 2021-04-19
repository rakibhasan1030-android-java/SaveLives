package com.example.savelives.home_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.BloodDonationRecyclerViewAdapter;
import com.example.savelives.R;
import com.example.savelives.adapters.NotificationRecyclerViewAdapter;
import com.example.savelives.models.BloodCampaignInfoPOJO;
import com.example.savelives.models.NotificationPOJO;

import java.util.ArrayList;
import java.util.List;


public class NotificationsFragment extends Fragment {

    List<NotificationPOJO> notificationInfoList;
    RecyclerView notificationRV;
    NotificationRecyclerViewAdapter notificationRecyclerViewAdapter;
    Context mContext;


    public NotificationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        mContext = getActivity().getApplicationContext();


        notificationRV = view.findViewById(R.id.notification_fragment_recycler_view);
        notificationInfoList = new ArrayList<>();

        notificationInfoList.add(new NotificationPOJO(getString(R.string.a_plus), getString(R.string.blood_request_notification_text_posted), getString(R.string.one_min_ago), false));
        notificationInfoList.add(new NotificationPOJO(getString(R.string.a_plus), getString(R.string.blood_request_notification_text_posted), getString(R.string.one_min_ago), false));
        notificationInfoList.add(new NotificationPOJO(getString(R.string.a_plus), getString(R.string.blood_request_notification_text_posted), getString(R.string.one_min_ago), false));

        notificationInfoList.add(new NotificationPOJO(R.drawable.share_icon, getString(R.string.blood_request_notification_text_requested), getString(R.string.one_min_ago), true));
        notificationInfoList.add(new NotificationPOJO(R.drawable.share_icon, getString(R.string.blood_request_notification_text_earned), getString(R.string.one_min_ago), true));
        configureNotificationRecyclerViewAdapter(view, notificationInfoList);

        return view;
    }


    private void configureNotificationRecyclerViewAdapter(View view, List<NotificationPOJO> notificationInfoList) {
        notificationRecyclerViewAdapter = new NotificationRecyclerViewAdapter(notificationInfoList, mContext);
        notificationRV.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        notificationRV.setAdapter(notificationRecyclerViewAdapter);
    }





}