package com.example.sams.dto;

import jakarta.persistence.Column;

public class SchoolRequest {
    @Column(name = "schoolName", length = 350)
    private String schoolName;

    @Column(name = "phoneNumber", length = 50)
    private String phoneNumber;

    @Column(name = "emailAddress", length = 150)
    private String emailAddress;

    @Column(name = "mailerAddress", length = 150)
    private String mailerAddress;

    @Column(name = "mobileNumber", length = 50)
    private String mobileNumber;

    @Column(name = "districtCode")
    private Long districtCode;

    @Column(name = "address", length = 450)
    private String address;

    @Column(name = "website", length = 150)
    private String website;

    @Column(name = "imageName", length = 350)
    private String imageName;

    @Column(name = "HeadName", length = 250)
    private String headName;

    @Column(name = "HeadMobile", length = 150)
    private String headMobile;

    @Column(name = "HeadEmail", length = 150)
    private String headEmail;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMailerAddress() {
        return mailerAddress;
    }

    public void setMailerAddress(String mailerAddress) {
        this.mailerAddress = mailerAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Long districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getHeadMobile() {
        return headMobile;
    }

    public void setHeadMobile(String headMobile) {
        this.headMobile = headMobile;
    }

    public String getHeadEmail() {
        return headEmail;
    }

    public void setHeadEmail(String headEmail) {
        this.headEmail = headEmail;
    }
}
