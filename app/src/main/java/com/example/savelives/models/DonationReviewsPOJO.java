package com.example.savelives.models;

public class DonationReviewsPOJO {

    int userImage;
    String userName;
    String userReview;
    String reviewDate;

    public DonationReviewsPOJO(int userImage, String userName, String userReview, String reviewDate) {
        this.userImage = userImage;
        this.userName = userName;
        this.userReview = userReview;
        this.reviewDate = reviewDate;
    }


    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }
}
