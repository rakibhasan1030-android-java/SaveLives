package com.example.savelives.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;
import com.example.savelives.models.DonationHistoryPOJO;
import com.example.savelives.models.NotificationPOJO;

import java.util.List;

public class DonationHistoryRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<DonationHistoryPOJO> donationHistoryInfoList;
    Context mContext;

    public DonationHistoryRecyclerViewAdapter(List<DonationHistoryPOJO> donationHistoryInfoList, Context mContext) {
        this.donationHistoryInfoList = donationHistoryInfoList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_history_rv_item,
                parent, false);
        return new DonationHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (donationHistoryInfoList != null) {

            ((DonationHistoryViewHolder) holder).numberTv.setText(String.valueOf(position + 1));
            ((DonationHistoryViewHolder) holder).hospitalNameTv.setText(donationHistoryInfoList.get(position).getHospitalName());
            ((DonationHistoryViewHolder) holder).numberOfBloodDonationTv.setText(String.valueOf(donationHistoryInfoList.get(position).getNumberOfBloodDonation()));

        }

    }

    @Override
    public int getItemCount() {
        if (donationHistoryInfoList != null) {
            return donationHistoryInfoList.size();
        }
        return 0;
    }
}
