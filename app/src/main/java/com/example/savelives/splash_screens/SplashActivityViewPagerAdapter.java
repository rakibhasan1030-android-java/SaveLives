package com.example.savelives.splash_screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.savelives.R;

import java.util.List;

public class SplashActivityViewPagerAdapter extends PagerAdapter {


    Context mContext;
    List<SplashScreenItemPOJO> itemList;



    public SplashActivityViewPagerAdapter(Context mContext, List<SplashScreenItemPOJO> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout_screen = inflater.inflate(R.layout.splash_screen, null);

        ImageView main_image =  layout_screen.findViewById(R.id.ss_main_iv);
        ImageView blood_drop_image =  layout_screen.findViewById(R.id.ss_blood_drop_icon_iv);
        TextView title = layout_screen.findViewById(R.id.ss_title_tv);
        TextView description = layout_screen.findViewById(R.id.ss_description_tv);
        ConstraintLayout layout =  layout_screen.findViewById(R.id.ss_bottom_container);

        main_image.setImageResource(itemList.get(position).getMainImage());
        blood_drop_image.setImageResource(itemList.get(position).getBloodIconImage());
        title.setText(itemList.get(position).getTitle());
        description.setText(itemList.get(position).getDescription());


        if (position == 0){
            layout.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_red);
        }else {
            layout.setBackgroundResource(R.drawable.ss_rounded_corner_rectangle_blue);
        }

        container.addView(layout_screen);

        return layout_screen;

    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
