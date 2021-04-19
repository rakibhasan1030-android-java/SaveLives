package com.example.savelives.adapters;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;

public class UrgentAndMyRequestViewHolder extends RecyclerView.ViewHolder {

    TextView scheduleOrEmergencyTv, atTv, bloodDonationTimeTv, bloodGroupTv, hospitalNameTv, hospitalDistanceTv,
            notificationTimeTv, hospitalAddressTv, relationOrUserNameTv;

    AppCompatButton textBtn;

    ImageButton shareOrDeleteIcon;

    public UrgentAndMyRequestViewHolder(@NonNull View itemView) {
        super(itemView);

        scheduleOrEmergencyTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_schedule_or_emergencyTv);
        atTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_at_tv);
        bloodDonationTimeTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_donation_time_tv);
        bloodGroupTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_blood_group_tv);
        hospitalNameTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_hospital_name_tv);
        hospitalDistanceTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_hospital_distance_tv);
        hospitalAddressTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_hospital_address_tv);
        notificationTimeTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_notification_time_tv);
        relationOrUserNameTv = itemView.findViewById(R.id.urgent_and_my_request_list_item_user_name_or_relation_tv);

        textBtn = itemView.findViewById(R.id.urgent_and_my_request_list_item_text_btn);
        shareOrDeleteIcon = itemView.findViewById(R.id.urgent_and_my_request_list_item_share_or_delete_btn);

    }


}
