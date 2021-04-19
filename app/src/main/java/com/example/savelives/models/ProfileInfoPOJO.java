package com.example.savelives.models;

public class ProfileInfoPOJO extends ProfilePOJO{

    String infoDescription; //must wait a minimum of 56 days between whole blood donations.
    int firstBadgeIcon, secondBadgeIcon, thirdBadgeIcon, bloodDonationDayCount;
    boolean expandable;

    public ProfileInfoPOJO(String infoDescription, int firstBadgeIcon, int secondBadgeIcon, int thirdBadgeIcon, int bloodDonationDayCount) {
        this.infoDescription = infoDescription;
        this.firstBadgeIcon = firstBadgeIcon;
        this.secondBadgeIcon = secondBadgeIcon;
        this.thirdBadgeIcon = thirdBadgeIcon;
        this.bloodDonationDayCount = bloodDonationDayCount;
        this.expandable = false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public String getInfoDescription() {
        return infoDescription;
    }

    public void setInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
    }

    public int getFirstBadgeIcon() {
        return firstBadgeIcon;
    }

    public void setFirstBadgeIcon(int firstBadgeIcon) {
        this.firstBadgeIcon = firstBadgeIcon;
    }

    public int getSecondBadgeIcon() {
        return secondBadgeIcon;
    }

    public void setSecondBadgeIcon(int secondBadgeIcon) {
        this.secondBadgeIcon = secondBadgeIcon;
    }

    public int getThirdBadgeIcon() {
        return thirdBadgeIcon;
    }

    public void setThirdBadgeIcon(int thirdBadgeIcon) {
        this.thirdBadgeIcon = thirdBadgeIcon;
    }

    public int getBloodDonationDayCount() {
        return bloodDonationDayCount;
    }

    public void setBloodDonationDayCount(int bloodDonationDayCount) {
        this.bloodDonationDayCount = bloodDonationDayCount;
    }

}
