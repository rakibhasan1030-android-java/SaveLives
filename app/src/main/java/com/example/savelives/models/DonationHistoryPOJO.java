package com.example.savelives.models;

public class DonationHistoryPOJO {

    String hospitalName;
    int numberOfBloodDonation;


    public DonationHistoryPOJO(String hospitalName, int numberOfBloodDonation) {
        this.hospitalName = hospitalName;
        this.numberOfBloodDonation = numberOfBloodDonation;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getNumberOfBloodDonation() {
        return numberOfBloodDonation;
    }

    public void setNumberOfBloodDonation(int numberOfBloodDonation) {
        this.numberOfBloodDonation = numberOfBloodDonation;
    }


}
