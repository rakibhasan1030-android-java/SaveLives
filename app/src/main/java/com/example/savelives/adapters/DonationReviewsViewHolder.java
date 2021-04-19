package com.example.savelives.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;

public class DonationReviewsViewHolder extends RecyclerView.ViewHolder{

    ImageView userIV;
    TextView userNameTV, userReviewTv, reviewDateTv;

    public DonationReviewsViewHolder(@NonNull View itemView) {
        super(itemView);

        userIV = itemView.findViewById(R.id.reviews_item_user_iv);
        userNameTV = itemView.findViewById(R.id.reviews_item_user_name_tv);
        userReviewTv = itemView.findViewById(R.id.reviews_item_user_review_tv);
        reviewDateTv = itemView.findViewById(R.id.reviews_item_user_review_date_tv);

    }
}
