package com.example.sams.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class TutorAddRequest {

    private String tutorID;
    private String firstName;
    private String lastName;
    private String otherNames;
    private Date DOB;
    private Integer sex;
    private Long districtCode;
    private String hometown;
    private String mobile;
    private String phone;
    private String emailAddress;
    private String address;
    private String emergFullName;
    private String emergMobile;
    private String emergEmail;
    private Integer emergRelationship;
    private String emergAddress;
    private Long departmentID;

    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Long districtCode) {
        this.districtCode = districtCode;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergFullName() {
        return emergFullName;
    }

    public void setEmergFullName(String emergFullName) {
        this.emergFullName = emergFullName;
    }

    public String getEmergMobile() {
        return emergMobile;
    }

    public void setEmergMobile(String emergMobile) {
        this.emergMobile = emergMobile;
    }

    public String getEmergEmail() {
        return emergEmail;
    }

    public void setEmergEmail(String emergEmail) {
        this.emergEmail = emergEmail;
    }

    public Integer getEmergRelationship() {
        return emergRelationship;
    }

    public void setEmergRelationship(Integer emergRelationship) {
        this.emergRelationship = emergRelationship;
    }

    public String getEmergAddress() {
        return emergAddress;
    }

    public void setEmergAddress(String emergAddress) {
        this.emergAddress = emergAddress;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }
}
