package com.example.savelives.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;

public class DonationHistoryViewHolder extends RecyclerView.ViewHolder{

    TextView numberTv, hospitalNameTv, numberOfBloodDonationTv;

    public DonationHistoryViewHolder(@NonNull View itemView) {
        super(itemView);
        numberTv = itemView.findViewById(R.id.history_number_tv);
        hospitalNameTv = itemView.findViewById(R.id.history_hospital_name_tv);
        numberOfBloodDonationTv = itemView.findViewById(R.id.history_number_of_blood_donation_tv);

    }
}
