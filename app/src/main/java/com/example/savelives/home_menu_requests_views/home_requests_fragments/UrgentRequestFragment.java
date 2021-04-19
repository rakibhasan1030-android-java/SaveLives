package com.example.savelives.home_menu_requests_views.home_requests_fragments;

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
import com.example.savelives.adapters.UrgentAndMyRequestRecyclerViewAdapter;
import com.example.savelives.models.UrgentAndMyRequestPOJO;

import java.util.ArrayList;
import java.util.List;

public class UrgentRequestFragment extends Fragment  implements AdapterView.OnItemSelectedListener {


    List<UrgentAndMyRequestPOJO> requestInfoList;
    RecyclerView requestRv;
    Spinner spinner;
    UrgentAndMyRequestRecyclerViewAdapter urgentAndMyRequestRecyclerViewAdapter;


    public UrgentRequestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_urgent_request, container, false);

        spinner = view.findViewById(R.id.fragment_urgent_request_spinner);
        requestRv = view.findViewById(R.id.fragment_urgent_request_recycler_view);



        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Newest First");
        categories.add("Alphabetically");
        categories.add("Oldest First");
        categories.add("Time");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);



        requestInfoList = new ArrayList<>();
        requestInfoList.add(new UrgentAndMyRequestPOJO(
                getString(R.string.scheduled),
                getString(R.string.contact),
                getString(R.string.at),
                getString(R.string.donation_time),
                getString(R.string.o_plus),
                getString(R.string.jarin_hospital),
                getString(R.string.three_km),
                getString(R.string.notification_time),
                getString(R.string.hospital_address),
                getString(R.string.johnadam),
                R.drawable.share_icon));
        requestInfoList.add(new UrgentAndMyRequestPOJO(
                getString(R.string.emergency),
                getString(R.string.contact),
                getString(R.string.at),
                getString(R.string.donation_time),
                getString(R.string.o_plus),
                getString(R.string.jarin_hospital),
                getString(R.string.three_km),
                getString(R.string.notification_time),
                getString(R.string.hospital_address),
                getString(R.string.johnadam),
                R.drawable.share_icon));
        requestInfoList.add(new UrgentAndMyRequestPOJO(
                getString(R.string.emergency),
                getString(R.string.expired),
                getString(R.string.at),
                getString(R.string.donation_time),
                getString(R.string.o_plus),
                getString(R.string.jarin_hospital),
                getString(R.string.three_km),
                getString(R.string.notification_time),
                getString(R.string.hospital_address),
                getString(R.string.johnadam),
                R.drawable.share_icon));
        configureUrgentAndMyRequestAdapter(view, requestInfoList);



        return view;
    }

    private void configureUrgentAndMyRequestAdapter(View view, List<UrgentAndMyRequestPOJO> requestInfoList) {
        urgentAndMyRequestRecyclerViewAdapter = new UrgentAndMyRequestRecyclerViewAdapter(requestInfoList, getContext());
        requestRv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        requestRv.setAdapter(urgentAndMyRequestRecyclerViewAdapter);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}