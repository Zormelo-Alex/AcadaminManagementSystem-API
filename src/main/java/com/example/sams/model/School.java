package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schools")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_ID")
    private Integer schoolId;

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

    @Lob
    @Column(name = "schoolImage")
    private byte[] schoolImage;

    @Column(name = "HeadName", length = 250)
    private String headName;

    @Column(name = "HeadMobile", length = 150)
    private String headMobile;

    @Column(name = "HeadEmail", length = 150)
    private String headEmail;

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


    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

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

    public byte[] getSchoolImage() {
        return schoolImage;
    }

    public void setSchoolImage(byte[] schoolImage) {
        this.schoolImage = schoolImage;
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
}
