package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "academicyears")
public class AcademicYears {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKID", unique = true)
    private Long pkid;

    @Column(name = "academicYear", nullable = false, length = 50)
    private String academicYear;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "status")
    private Integer status;

    @Column(name = "createdate")
    private Date createDate;

    @Column(name = "createuserid")
    private Long createUserId;

    @Column(name = "lastupdated")
    private Date lastUpdated;

    @Column(name = "updateuserid")
    private Long updateUserId;

    @Column(name = "statusFlag")
    private Boolean statusFlag;

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
