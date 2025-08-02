package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tutors")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pkID")
    private Long pkID;

    @Column(name = "tutorID", nullable = false, length = 50, unique = true)
    private String tutorID;

    @Column(name = "firstName", length = 250)
    private String firstName;

    @Column(name = "lastName", length = 250)
    private String lastName;

    @Column(name = "otherNames", length = 350)
    private String otherNames;

    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date DOB;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "districtCode")
    private Long districtCode;

    @Column(name = "hometown", length = 150)
    private String hometown;

    @Column(name = "mobile", length = 50)
    private String mobile;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "emailAddress", length = 150)
    private String emailAddress;

    @Column(name = "Address", length = 350)
    private String address;

    @Column(name = "picturePath", length = 50)
    private String picturePath;

    @Lob
    @Column(name = "pictureImage")
    private byte[] pictureImage;

    @Column(name = "emergFullName", length = 350)
    private String emergFullName;

    @Column(name = "emergMobile", length = 50)
    private String emergMobile;

    @Column(name = "emergEmail", length = 50)
    private String emergEmail;

    @Column(name = "emergRelationship")
    private Integer emergRelationship;

    @Column(name = "emergAddress", length = 450)
    private String emergAddress;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdate")
    private Date createDate;

    @Column(name = "createuserid")
    private Long createUserId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastupdated")
    private Date lastUpdated;

    @Column(name = "updateuserid")
    private Long updateUserId;

    @Column(name = "statusFlag")
    private Boolean statusFlag;

    @Column(name = "departmentID")
    private Long departmentID;

    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public Long getPkID() {
        return pkID;
    }

    public void setPkID(Long pkID) {
        this.pkID = pkID;
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

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public byte[] getPictureImage() {
        return pictureImage;
    }

    public void setPictureImage(byte[] pictureImage) {
        this.pictureImage = pictureImage;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Boolean getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Boolean statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }
}
