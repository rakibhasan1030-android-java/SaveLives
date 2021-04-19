package com.example.savelives.models;

public class UrgentAndMyRequestPOJO {

    String scheduleOrEmergency, buttonText, at, bloodDonationTime, bloodGroup, hospitalName, hospitalDistance,
    notificationTime, hospitalAddress, relationOrUserName;
    int shareOrDeleteIcon;

    public UrgentAndMyRequestPOJO(
            String scheduleOrEmergency,
            String buttonText,
            String at,
            String bloodDonationTime,
            String bloodGroup,
            String hospitalName,
            String hospitalDistance,
            String notificationTime,
            String hospitalAddress,
            String relationOrUserName,
            int shareOrDeleteIcon) {

        this.scheduleOrEmergency = scheduleOrEmergency;
        this.buttonText = buttonText;
        this.at = at;
        this.bloodDonationTime = bloodDonationTime;
        this.bloodGroup = bloodGroup;
        this.hospitalName = hospitalName;
        this.hospitalDistance = hospitalDistance;
        this.notificationTime = notificationTime;
        this.hospitalAddress = hospitalAddress;
        this.relationOrUserName = relationOrUserName;
        this.shareOrDeleteIcon = shareOrDeleteIcon;
    }


    public String getScheduleOrEmergency() {
        return scheduleOrEmergency;
    }

    public void setScheduleOrEmergency(String scheduleOrEmergency) {
        this.scheduleOrEmergency = scheduleOrEmergency;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getBloodDonationTime() {
        return bloodDonationTime;
    }

    public void setBloodDonationTime(String bloodDonationTime) {
        this.bloodDonationTime = bloodDonationTime;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalDistance() {
        return hospitalDistance;
    }

    public void setHospitalDistance(String hospitalDistance) {
        this.hospitalDistance = hospitalDistance;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getRelationOrUserName() {
        return relationOrUserName;
    }

    public void setRelationOrUserName(String relationOrUserName) {
        this.relationOrUserName = relationOrUserName;
    }

    public int getShareOrDeleteIcon() {
        return shareOrDeleteIcon;
    }

    public void setShareOrDeleteIcon(int shareOrDeleteIcon) {
        this.shareOrDeleteIcon = shareOrDeleteIcon;
    }
}
