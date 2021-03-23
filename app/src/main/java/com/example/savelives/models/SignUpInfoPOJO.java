package com.example.savelives.models;

import java.io.Serializable;

public class SignUpInfoPOJO implements Serializable {

    String userName, email, password, phoneNumber, altPhoneNumber, social, streetAddress, city, blood_group, gender,dateOfBirthMonth, userAvatar;
    Boolean isWeightAboveFiftyKg;
    int age, dateOfBirthDay, postal_code;

    public SignUpInfoPOJO() {
    }

    public SignUpInfoPOJO(String userName, String email, String password, String phoneNumber, String altPhoneNumber, String social,
                          String streetAddress, String city, String blood_group, String gender, String dateOfBirthMonth, String userAvatar,
                          Boolean isWeightAboveFiftyKg, int age, int dateOfBirthDay, int postal_code) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.altPhoneNumber = altPhoneNumber;
        this.social = social;
        this.streetAddress = streetAddress;
        this.city = city;
        this.blood_group = blood_group;
        this.gender = gender;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.userAvatar = userAvatar;
        this.isWeightAboveFiftyKg = isWeightAboveFiftyKg;
        this.age = age;
        this.dateOfBirthDay = dateOfBirthDay;
        this.postal_code = postal_code;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAltPhoneNumber(String altPhoneNumber) {
        this.altPhoneNumber = altPhoneNumber;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Boolean getWeightAboveFiftyKg() {
        return isWeightAboveFiftyKg;
    }

    public void setWeightAboveFiftyKg(Boolean weightAboveFiftyKg) {
        isWeightAboveFiftyKg = weightAboveFiftyKg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirthDay(int dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    public String getSocial() {
        return social;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public int getAge() {
        return age;
    }

    public int getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public int getPostal_code() {
        return postal_code;
    }

    @Override
    public String toString() {
        return "SignUpInfoPOJO{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", altPhoneNumber='" + altPhoneNumber + '\'' +
                ", social='" + social + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", blood_group='" + blood_group + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirthMonth='" + dateOfBirthMonth + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", isWeightAboveFiftyKg=" + isWeightAboveFiftyKg +
                ", age=" + age +
                ", dateOfBirthDay=" + dateOfBirthDay +
                ", postal_code=" + postal_code +
                '}';
    }
}
