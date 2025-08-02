package com.example.sams.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class StudentAddRequest {
    @Column(name = "studentID_old", length = 50)
    private String studentIDOld;

    @Column(name = "studentID", length = 50, nullable = false)
    private String studentID;

    @Column(name = "firstName", length = 250)
    private String firstName;

    @Column(name = "lastName", length = 250)
    private String lastName;

    @Column(name = "otherNames", length = 350)
    private String otherNames;

    @Column(name = "programmeID")
    private Long programmeID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DOB")
    private Date dob;

    @Column(name = "sex")
    private Integer sex; // Assuming 0/1 (or male/female) integer representation

    @Column(name = "districtCode")
    private Long districtCode;

    @Column(name = "hometown", length = 150)
    private String hometown;

    @Column(name = "groupID")
    private Long groupID;

    @Column(name = "mobile", length = 50)
    private String mobile;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "emailAddress", length = 150)
    private String emailAddress;

    @Column(name = "postalAddress", length = 350)
    private String postalAddress;

    @Column(name = "residentialAddress", length = 450)
    private String residentialAddress;

    @Column(name = "emergRelationship")
    private Integer emergRelationship;

    @Column(name = "contactPersonName", length = 350)
    private String contactPersonName;

    @Column(name = "contactPersonMobile", length = 50)
    private String contactPersonMobile;

    @Column(name = "contactPersonEmail", length = 150)
    private String contactPersonEmail;

    public String getStudentIDOld() {
        return studentIDOld;
    }

    public void setStudentIDOld(String studentIDOld) {
        this.studentIDOld = studentIDOld;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

    public Long getProgrammeID() {
        return programmeID;
    }

    public void setProgrammeID(Long programmeID) {
        this.programmeID = programmeID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
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

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public Integer getEmergRelationship() {
        return emergRelationship;
    }

    public void setEmergRelationship(Integer emergRelationship) {
        this.emergRelationship = emergRelationship;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonMobile() {
        return contactPersonMobile;
    }

    public void setContactPersonMobile(String contactPersonMobile) {
        this.contactPersonMobile = contactPersonMobile;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }
}
