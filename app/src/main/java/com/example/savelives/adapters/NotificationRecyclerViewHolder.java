package com.example.savelives.adapters;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;

public class NotificationRecyclerViewHolder extends RecyclerView.ViewHolder{

    TextView notificationTextTv, notificationTimeTv;
    AppCompatButton bloodGroupBtn;
    ImageButton bloodIconIb;

    public NotificationRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        bloodGroupBtn = itemView.findViewById(R.id.notification_blood_group_btn);
        notificationTextTv = itemView.findViewById(R.id.notification_text_tv);
        notificationTimeTv = itemView.findViewById(R.id.notification_time_tv);
        bloodIconIb = itemView.findViewById(R.id.notification_icon_ib);
    }
}
