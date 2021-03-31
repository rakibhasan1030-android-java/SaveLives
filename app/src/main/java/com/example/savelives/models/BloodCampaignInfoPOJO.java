package com.example.savelives.models;

public class BloodCampaignInfoPOJO {

    String bloodCampaignName;
    String postedBy;
    String time;
    int campaignCover;

    public BloodCampaignInfoPOJO(String bloodCampaignName, String postedBy, String time, int campaignCover) {
        this.bloodCampaignName = bloodCampaignName;
        this.postedBy = postedBy;
        this.time = time;
        this.campaignCover = campaignCover;
    }

    public String getBloodCampaignName() {
        return bloodCampaignName;
    }

    public void setBloodCampaignName(String bloodCampaignName) {
        this.bloodCampaignName = bloodCampaignName;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCampaignCover() {
        return campaignCover;
    }

    public void setCampaignCover(int campaignCover) {
        this.campaignCover = campaignCover;
    }
}
