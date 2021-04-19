package com.example.savelives.home_menu_requests_views.home_menu_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.savelives.R;
import com.example.savelives.adapters.DonationHistoryRecyclerViewAdapter;
import com.example.savelives.adapters.DonationReviewsRecyclerViewAdapter;
import com.example.savelives.adapters.UrgentAndMyRequestRecyclerViewAdapter;
import com.example.savelives.models.DonationHistoryPOJO;
import com.example.savelives.models.DonationReviewsPOJO;

import java.util.ArrayList;
import java.util.List;

public class DonationFragment extends Fragment  implements AdapterView.OnItemSelectedListener {

    List<DonationHistoryPOJO> donationHistoryInfoList;
    List<DonationReviewsPOJO> donationReviewsInfoList;
    RecyclerView historyRv, reviewsRv;
    DonationHistoryRecyclerViewAdapter donationHistoryRecyclerViewAdapter;
    DonationReviewsRecyclerViewAdapter donationReviewsRecyclerViewAdapter;
    Spinner spinner;



    public DonationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donation, container, false);

        spinner = view.findViewById(R.id.donation_history_spinner);
        historyRv = view.findViewById(R.id.donation_history_rv);
        reviewsRv = view.findViewById(R.id.donation_reviews_rv);


        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Upcoming Appointments");
        categories.add("Alphabetically");
        categories.add("Oldest First");
        categories.add("Time");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        donationHistoryInfoList = new ArrayList<>();
        donationHistoryInfoList.add(new DonationHistoryPOJO(getString(R.string.kings_land_hospital), 2));
        donationHistoryInfoList.add(new DonationHistoryPOJO(getString(R.string.kings_land_hospital), 1));
        donationHistoryInfoList.add(new DonationHistoryPOJO(getString(R.string.kings_land_hospital), 1));

        donationReviewsInfoList = new ArrayList<>();
        donationReviewsInfoList.add(new DonationReviewsPOJO(R.drawable.pic, getString(R.string.ashiq),getString(R.string.lorum_ipsum_description),getString(R.string.dec_twenty_seven)));


        configureDonationHistoryRecyclerViewAdapter(view, donationHistoryInfoList);
        configureDonationReviewsRecyclerViewAdapter(view, donationReviewsInfoList);


        return view;
    }

    private void configureDonationReviewsRecyclerViewAdapter(View view, List<DonationReviewsPOJO> donationReviewsInfoList) {
        donationReviewsRecyclerViewAdapter = new DonationReviewsRecyclerViewAdapter(donationReviewsInfoList, getContext());
        reviewsRv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        reviewsRv.setAdapter(donationReviewsRecyclerViewAdapter);
    }

    private void configureDonationHistoryRecyclerViewAdapter(View view, List<DonationHistoryPOJO> donationHistoryInfoList) {
        donationHistoryRecyclerViewAdapter = new DonationHistoryRecyclerViewAdapter(donationHistoryInfoList, getContext());
        historyRv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        historyRv.setAdapter(donationHistoryRecyclerViewAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
       // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}