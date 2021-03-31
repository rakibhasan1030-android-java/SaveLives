package com.example.savelives;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BloodDonationViewHolder extends RecyclerView.ViewHolder {

    ImageView bloodCampaignIV;
    TextView bloodCampaignTitleTV;
    TextView bloodCampaignPostedBy;
    TextView bloodCampaignTimeTV;

    public BloodDonationViewHolder(@NonNull View itemView) {
        super(itemView);
        bloodCampaignIV = itemView.findViewById(R.id.blood_campaign_cover_iv);
        bloodCampaignTitleTV = itemView.findViewById(R.id.blood_campaign_name);
        bloodCampaignPostedBy = itemView.findViewById(R.id.blood_campaign_posted_by);
        bloodCampaignTimeTV = itemView.findViewById(R.id.blood_campaign_time);
    }
}
