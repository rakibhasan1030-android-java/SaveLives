package com.example.savelives.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;
import com.example.savelives.models.DonationHistoryPOJO;
import com.example.savelives.models.DonationReviewsPOJO;

import java.util.List;

public class DonationReviewsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<DonationReviewsPOJO> donationReviewInfoList;
    Context mContext;

    public DonationReviewsRecyclerViewAdapter(List<DonationReviewsPOJO> donationReviewInfoList, Context mContext) {
        this.donationReviewInfoList = donationReviewInfoList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_reviews_rv_item,
                parent, false);
        return new DonationReviewsViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (donationReviewInfoList != null) {

            ((DonationReviewsViewHolder) holder).userIV.setImageResource(donationReviewInfoList.get(position).getUserImage());
            ((DonationReviewsViewHolder) holder).userNameTV.setText(donationReviewInfoList.get(position).getUserName());
            ((DonationReviewsViewHolder) holder).userReviewTv.setText(donationReviewInfoList.get(position).getUserReview());
            ((DonationReviewsViewHolder) holder).reviewDateTv.setText(donationReviewInfoList.get(position).getReviewDate());

        }

    }

    @Override
    public int getItemCount() {
        if (donationReviewInfoList != null) {
            return donationReviewInfoList.size();
        }
        return 0;    }
}
