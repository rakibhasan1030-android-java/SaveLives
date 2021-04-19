package com.example.savelives;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.models.BloodCampaignInfoPOJO;

import java.util.List;

public class BloodDonationRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<BloodCampaignInfoPOJO> campaignInfoList;

    public BloodDonationRecyclerViewAdapter(List<BloodCampaignInfoPOJO> campaignInfoList) {
        this.campaignInfoList = campaignInfoList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fargment_view_pager_list_item,
                parent, false);
        return new BloodDonationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((BloodDonationViewHolder) holder).bloodCampaignIV.setImageResource(campaignInfoList.get(position).getCampaignCover());
        ((BloodDonationViewHolder) holder).bloodCampaignTitleTV.setText(campaignInfoList.get(position).getBloodCampaignName());
        ((BloodDonationViewHolder) holder).bloodCampaignPostedBy.setText(campaignInfoList.get(position).getPostedBy());
        ((BloodDonationViewHolder) holder).bloodCampaignTimeTV.setText(campaignInfoList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        if (campaignInfoList != null) {
            return campaignInfoList.size();
        }
        return 0;
    }
}
