package com.example.savelives.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savelives.R;
import com.example.savelives.models.ProfileBadgesPOJO;
import com.example.savelives.models.ProfileInfoPOJO;
import com.example.savelives.models.ProfilePOJO;

import java.util.List;

public class ProfileRecyclerViewAdapter extends RecyclerView.Adapter {

    List<ProfilePOJO> list;
    Context mContext;
            public static final int PROFILE_INFO_VIEW_TYPE = 0;
    public static final int PROFILE_DONATION_VIEW_TYPE = 1;
    public static final int PROFILE_BADGE_VIEW_TYPE = 2;


    public ProfileRecyclerViewAdapter(List<ProfilePOJO> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }



    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof ProfileInfoPOJO){
            return PROFILE_INFO_VIEW_TYPE;
        }else if (list.get(position) instanceof ProfileBadgesPOJO){
            return PROFILE_BADGE_VIEW_TYPE;
        }else {
            return PROFILE_DONATION_VIEW_TYPE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        if (viewType == PROFILE_INFO_VIEW_TYPE){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_fragment_info_list_item,parent,false);
            return new InfoViewHolder(view);
        }else if (viewType == PROFILE_BADGE_VIEW_TYPE){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_fragment_badges_list_item,parent,false);
            return new BadgeViewHolder(view);
        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_fragment_donation_list_item_main, parent,false);
            return new DonationViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ProfilePOJO profilePOJO = list.get(position);
        boolean isExpandable = ((ProfilePOJO) profilePOJO).isExpandable();

        if (holder instanceof InfoViewHolder){
            InfoViewHolder infoViewHolder = (InfoViewHolder) holder;
            ProfileInfoPOJO infoPOJO = (ProfileInfoPOJO) profilePOJO;

            infoViewHolder.profileInfoDesTv.setText(infoPOJO.getInfoDescription());
            infoViewHolder.profileInfoFirstBadgeIv.setBackgroundResource(infoPOJO.getFirstBadgeIcon());
            infoViewHolder.profileInfoSecondBadgeIv.setBackgroundResource(infoPOJO.getSecondBadgeIcon());
            infoViewHolder.profileInfoThirdBadgeIv.setBackgroundResource(infoPOJO.getThirdBadgeIcon());
            infoViewHolder.profileInfoDonationDayCountTv.setText(String.valueOf(infoPOJO.getBloodDonationDayCount()));
            infoViewHolder.profileInfoBloodDonationPb.setProgress(70);

            infoViewHolder.infoExpandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

        }else if (holder instanceof BadgeViewHolder){
            BadgeViewHolder infoViewHolder = (BadgeViewHolder) holder;
            ProfileBadgesPOJO infoPOJO = (ProfileBadgesPOJO) profilePOJO;

            infoViewHolder.profileBadgeFirstBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeFirstBadge());
            infoViewHolder.profileBadgeSecondBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeSecondBadge());
            infoViewHolder.profileBadgeThirdBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeThirdBadge());
            infoViewHolder.profileBadgeForthBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeForthBadge());
            infoViewHolder.profileBadgeFifthBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeFifthBadge());
            infoViewHolder.profileBadgeSixthBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeSixthBadge());
            infoViewHolder.profileBadgeSeventhBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeSeventhBadge());
            infoViewHolder.profileBadgeEighthBadgeIv.setBackgroundResource(infoPOJO.getProfileBadgeEighthBadge());

            infoViewHolder.badgeExpandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

        }else {
            //nothing
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    private class InfoViewHolder extends RecyclerView.ViewHolder {

        //info items
        TextView profileInfoDesTv, profileInfoDonationDayCountTv;
        ProgressBar profileInfoBloodDonationPb;
        ImageView profileInfoFirstBadgeIv, profileInfoSecondBadgeIv, profileInfoThirdBadgeIv, infoExpanderIcon;
        LinearLayout infoExpandableLayout;

        public InfoViewHolder(@NonNull View itemView) {
            super(itemView);
            profileInfoDesTv = itemView.findViewById(R.id.profile_fragment_info_des_tv);
            profileInfoDonationDayCountTv = itemView.findViewById(R.id.profile_fragment_info_donation_day_count_tv);
            profileInfoBloodDonationPb = itemView.findViewById(R.id.profile_fragment_info_progress_bar);
            profileInfoFirstBadgeIv = itemView.findViewById(R.id.profile_fragment_info_first_badge_iv);
            profileInfoSecondBadgeIv = itemView.findViewById(R.id.profile_fragment_info_second_badge_iv);
            profileInfoThirdBadgeIv = itemView.findViewById(R.id.profile_fragment_info_third_badge_iv);
            infoExpanderIcon = itemView.findViewById(R.id.profile_fragment_info_expand_iv);
            infoExpandableLayout = itemView.findViewById(R.id.profile_fragment_info_expandable_layout);

            infoExpanderIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProfilePOJO profilePOJO = list.get(getAdapterPosition());
                    ProfileInfoPOJO infoPOJO = (ProfileInfoPOJO) profilePOJO;
                    infoPOJO.setExpandable(!infoPOJO.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }

            });


        }
    }

    private class BadgeViewHolder extends RecyclerView.ViewHolder {

        //Badge items
        ImageView profileBadgeFirstBadgeIv, profileBadgeSecondBadgeIv, profileBadgeThirdBadgeIv,
                profileBadgeForthBadgeIv,profileBadgeFifthBadgeIv,profileBadgeSixthBadgeIv,
                profileBadgeSeventhBadgeIv,profileBadgeEighthBadgeIv , badgeExpanderIcon;

        LinearLayout badgeExpandableLayout;


        public BadgeViewHolder(@NonNull View itemView) {
            super(itemView);
            profileBadgeFirstBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_first_badge_iv);
            profileBadgeSecondBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_second_badge_iv);
            profileBadgeThirdBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_third_badge_iv);
            profileBadgeForthBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_forth_badge_iv);
            profileBadgeFifthBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_fifth_badge_iv);
            profileBadgeSixthBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_sixth_badge_iv);
            profileBadgeSeventhBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_seventh_badge_iv);
            profileBadgeEighthBadgeIv = itemView.findViewById(R.id.profile_fragment_badge_eighth_badge_iv);
            badgeExpanderIcon = itemView.findViewById(R.id.profile_fragment_badges_expand_iv);
            badgeExpandableLayout = itemView.findViewById(R.id.profile_fragment_badges_expandable_layout);


            badgeExpanderIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProfilePOJO profilePOJO = list.get(getAdapterPosition());
                    ProfileInfoPOJO infoPOJO = (ProfileInfoPOJO) profilePOJO;
                    infoPOJO.setExpandable(!infoPOJO.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }

            });


        }
    }

    private class DonationViewHolder  extends RecyclerView.ViewHolder {

        ImageView donationExpanderIcon;
        LinearLayout donationExpandableLayout;

        public DonationViewHolder(@NonNull View itemView) {
            super(itemView);
            donationExpanderIcon = itemView.findViewById(R.id.profile_fragment_donation_expand_iv);
            donationExpandableLayout = itemView.findViewById(R.id.profile_fragment_donation_expandable_layout);

            donationExpanderIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProfilePOJO profilePOJO = list.get(getAdapterPosition());
                    ProfileBadgesPOJO infoPOJO = (ProfileBadgesPOJO) profilePOJO;
                    infoPOJO.setExpandable(!infoPOJO.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });


        }
    }

}
