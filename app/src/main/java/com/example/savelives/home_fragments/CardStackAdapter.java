package com.example.savelives.home_fragments;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.R;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.StackAdapter;

public class CardStackAdapter extends StackAdapter<Integer> {


    public CardStackAdapter(Context context) {
        super(context);
    }

    @Override
    public void bindView(Integer data, int position, CardStackView.ViewHolder holder) {

        if (holder instanceof CardStackViewHolderInfoContact) {
            CardStackViewHolderInfoContact h = (CardStackViewHolderInfoContact) holder;
            h.onBind(data, position);
        } else if (holder instanceof CardStackViewHolderDonationRequest) {
            CardStackViewHolderDonationRequest viewHolderDonationRequest = (CardStackViewHolderDonationRequest) holder;
            viewHolderDonationRequest.onBind(data, position);
        } else if (holder instanceof CardStackViewHolderBadges) {
            CardStackViewHolderBadges viewHolderBadges = (CardStackViewHolderBadges) holder;
            viewHolderBadges.onBind(data, position);
        }

    }


    @Override
    protected CardStackView.ViewHolder onCreateView(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case R.layout.profile_fragment_info_contact_list_item:
                view = getLayoutInflater().inflate(R.layout.profile_fragment_info_contact_list_item, parent, false);
                return new CardStackViewHolderInfoContact(view);
            case R.layout.profile_fragment_donation_request_list_item:
                view = getLayoutInflater().inflate(R.layout.profile_fragment_donation_request_list_item, parent, false);
                return new CardStackViewHolderDonationRequest(view);
            default:
                view = getLayoutInflater().inflate(R.layout.profile_fragment_badges_list_item, parent, false);
                return new CardStackViewHolderBadges(view);
        }
    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {//TODO TEST LARGER ITEM
            return R.layout.profile_fragment_badges_list_item;
        } else if (position == 1) {
            return R.layout.profile_fragment_donation_request_list_item;
        } else {
            return R.layout.profile_fragment_info_contact_list_item;
        }
    }
    
}
