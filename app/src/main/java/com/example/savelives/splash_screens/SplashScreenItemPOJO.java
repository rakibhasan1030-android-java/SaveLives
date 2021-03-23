package com.example.savelives.splash_screens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenItemPOJO {

    Context mContext;

    int mainImage;
    int bloodIconImage;
    int title;
    int description;
    public SplashScreenItemPOJO(int mainImage) {
        this.mainImage = mainImage;
    }

    public SplashScreenItemPOJO(int mainImage, int bloodIconImage, int title, int description) {
        this.mainImage = mainImage;
        this.bloodIconImage = bloodIconImage;
        this.title = title;
        this.description = description;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public void setBloodIconImage(int bloodIconImage) {
        this.bloodIconImage = bloodIconImage;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getMainImage() {
        return mainImage;
    }

    public int getBloodIconImage() {
        return bloodIconImage;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }

}
