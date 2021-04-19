package com.example.savelives.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;
import com.example.savelives.models.NotificationPOJO;
import com.example.savelives.models.UrgentAndMyRequestPOJO;

import java.util.List;

public class NotificationRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<NotificationPOJO> notificationInfoList;
    Context mContext;

    public NotificationRecyclerViewAdapter(List<NotificationPOJO> notificationInfoList, Context mContext) {
        this.notificationInfoList = notificationInfoList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_recycler_view_item,
                parent, false);
        return new NotificationRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (notificationInfoList.get(position).isIconTypeNotification()) {
            ((NotificationRecyclerViewHolder) holder).bloodIconIb.setImageResource(notificationInfoList.get(position).getNotificationImage());
            ((NotificationRecyclerViewHolder) holder).bloodGroupBtn.setVisibility(View.GONE);

        } else {
            ((NotificationRecyclerViewHolder) holder).bloodGroupBtn.setText(notificationInfoList.get(position).getBloodGroup());
            ((NotificationRecyclerViewHolder) holder).bloodIconIb.setVisibility(View.GONE);
        }
        ((NotificationRecyclerViewHolder) holder).notificationTextTv.setText(notificationInfoList.get(position).getNotificationText());
        ((NotificationRecyclerViewHolder) holder).notificationTimeTv.setText(notificationInfoList.get(position).getNotificationTime());

    }

    @Override
    public int getItemCount() {
        if (notificationInfoList != null) {
            return notificationInfoList.size();
        }
        return 0;
    }



}
