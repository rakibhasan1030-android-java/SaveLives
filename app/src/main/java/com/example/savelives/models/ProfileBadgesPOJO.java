package com.example.savelives.models;

public class ProfileBadgesPOJO extends ProfilePOJO{

    int profileBadgeFirstBadge, profileBadgeSecondBadge, profileBadgeThirdBadge,
            profileBadgeForthBadge,profileBadgeFifthBadge,profileBadgeSixthBadge,
            profileBadgeSeventhBadge,profileBadgeEighthBadge;
    boolean expandable;


    public ProfileBadgesPOJO(int profileBadgeFirstBadge, int profileBadgeSecondBadge, int profileBadgeThirdBadge,
                             int profileBadgeForthBadge, int profileBadgeFifthBadge, int profileBadgeSixthBadge,
                             int profileBadgeSeventhBadge, int profileBadgeEighthBadge) {
        this.profileBadgeFirstBadge = profileBadgeFirstBadge;
        this.profileBadgeSecondBadge = profileBadgeSecondBadge;
        this.profileBadgeThirdBadge = profileBadgeThirdBadge;
        this.profileBadgeForthBadge = profileBadgeForthBadge;
        this.profileBadgeFifthBadge = profileBadgeFifthBadge;
        this.profileBadgeSixthBadge = profileBadgeSixthBadge;
        this.profileBadgeSeventhBadge = profileBadgeSeventhBadge;
        this.profileBadgeEighthBadge = profileBadgeEighthBadge;
        this.expandable = false;

    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public int getProfileBadgeFirstBadge() {
        return profileBadgeFirstBadge;
    }

    public void setProfileBadgeFirstBadge(int profileBadgeFirstBadge) {
        this.profileBadgeFirstBadge = profileBadgeFirstBadge;
    }

    public int getProfileBadgeSecondBadge() {
        return profileBadgeSecondBadge;
    }

    public void setProfileBadgeSecondBadge(int profileBadgeSecondBadge) {
        this.profileBadgeSecondBadge = profileBadgeSecondBadge;
    }

    public int getProfileBadgeThirdBadge() {
        return profileBadgeThirdBadge;
    }

    public void setProfileBadgeThirdBadge(int profileBadgeThirdBadge) {
        this.profileBadgeThirdBadge = profileBadgeThirdBadge;
    }

    public int getProfileBadgeForthBadge() {
        return profileBadgeForthBadge;
    }

    public void setProfileBadgeForthBadge(int profileBadgeForthBadge) {
        this.profileBadgeForthBadge = profileBadgeForthBadge;
    }

    public int getProfileBadgeFifthBadge() {
        return profileBadgeFifthBadge;
    }

    public void setProfileBadgeFifthBadge(int profileBadgeFifthBadge) {
        this.profileBadgeFifthBadge = profileBadgeFifthBadge;
    }

    public int getProfileBadgeSixthBadge() {
        return profileBadgeSixthBadge;
    }

    public void setProfileBadgeSixthBadge(int profileBadgeSixthBadge) {
        this.profileBadgeSixthBadge = profileBadgeSixthBadge;
    }

    public int getProfileBadgeSeventhBadge() {
        return profileBadgeSeventhBadge;
    }

    public void setProfileBadgeSeventhBadge(int profileBadgeSeventhBadge) {
        this.profileBadgeSeventhBadge = profileBadgeSeventhBadge;
    }

    public int getProfileBadgeEighthBadge() {
        return profileBadgeEighthBadge;
    }

    public void setProfileBadgeEighthBadge(int profileBadgeEighthBadge) {
        this.profileBadgeEighthBadge = profileBadgeEighthBadge;
    }
}
