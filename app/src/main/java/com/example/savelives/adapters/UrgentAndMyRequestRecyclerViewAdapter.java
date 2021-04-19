package com.example.savelives.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.BloodDonationViewHolder;
import com.example.savelives.R;
import com.example.savelives.models.BloodCampaignInfoPOJO;
import com.example.savelives.models.UrgentAndMyRequestPOJO;

import java.util.List;

public class UrgentAndMyRequestRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<UrgentAndMyRequestPOJO> requestInfoList;

    Context context;
    public UrgentAndMyRequestRecyclerViewAdapter(List<UrgentAndMyRequestPOJO> requestInfoList, Context context) {
        this.requestInfoList = requestInfoList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.urgent_and_my_request_list_item,
                parent, false);
        return new UrgentAndMyRequestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((UrgentAndMyRequestViewHolder) holder).scheduleOrEmergencyTv.setText(requestInfoList.get(position).getScheduleOrEmergency());
        ((UrgentAndMyRequestViewHolder) holder).atTv.setText(requestInfoList.get(position).getAt());
        ((UrgentAndMyRequestViewHolder) holder).bloodDonationTimeTv.setText(requestInfoList.get(position).getBloodDonationTime());
        ((UrgentAndMyRequestViewHolder) holder).bloodGroupTv.setText(requestInfoList.get(position).getBloodGroup());
        ((UrgentAndMyRequestViewHolder) holder).hospitalNameTv.setText(requestInfoList.get(position).getHospitalName());
        ((UrgentAndMyRequestViewHolder) holder).hospitalDistanceTv.setText(requestInfoList.get(position).getHospitalDistance());
        ((UrgentAndMyRequestViewHolder) holder).hospitalAddressTv.setText(requestInfoList.get(position).getHospitalAddress());
        ((UrgentAndMyRequestViewHolder) holder).notificationTimeTv.setText(requestInfoList.get(position).getNotificationTime());
        ((UrgentAndMyRequestViewHolder) holder).relationOrUserNameTv.setText(requestInfoList.get(position).getRelationOrUserName());

        if(requestInfoList.get(position).getButtonText() == context.getResources().getString(R.string.managed)){
            ((UrgentAndMyRequestViewHolder)holder).textBtn.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_button_bg_green);
        }else if (requestInfoList.get(position).getButtonText() == context.getResources().getString(R.string.expired)){
            ((UrgentAndMyRequestViewHolder)holder).textBtn.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_button_bg_gray);
        }else {
            ((UrgentAndMyRequestViewHolder)holder).textBtn.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_button_bg_red);
        }
        ((UrgentAndMyRequestViewHolder) holder).textBtn.setText(requestInfoList.get(position).getButtonText());

        ((UrgentAndMyRequestViewHolder) holder).shareOrDeleteIcon.setImageResource(requestInfoList.get(position).getShareOrDeleteIcon());

    }

    @Override
    public int getItemCount() {
        if (requestInfoList != null) {
            return requestInfoList.size();
        }
        return 0;
    }
}
