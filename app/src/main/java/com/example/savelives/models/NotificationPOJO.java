package com.example.savelives.models;

public class NotificationPOJO {

    String bloodGroup, notificationText, notificationTime;
    int notificationImage;
    boolean isIconTypeNotification;

    public NotificationPOJO(String bloodGroup, String notificationText, String notificationTime, boolean isIconTypeNotification) {
        this.bloodGroup = bloodGroup;
        this.notificationText = notificationText;
        this.notificationTime = notificationTime;
        this.isIconTypeNotification = isIconTypeNotification;
    }

    public NotificationPOJO(int notificationImage, String notificationText, String notificationTime, boolean isIconTypeNotification) {
        this.notificationImage = notificationImage;
        this.notificationText = notificationText;
        this.notificationTime = notificationTime;
        this.isIconTypeNotification = isIconTypeNotification;
    }



    public boolean isIconTypeNotification() {
        return isIconTypeNotification;
    }

    public void setIconTypeNotification(boolean iconTypeNotification) {
        isIconTypeNotification = iconTypeNotification;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }

    public int getNotificationImage() {
        return notificationImage;
    }

    public void setNotificationImage(int notificationImage) {
        this.notificationImage = notificationImage;
    }
}
