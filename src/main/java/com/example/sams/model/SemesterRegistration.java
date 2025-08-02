package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "semesterregistration")
public class SemesterRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semPKID")
    private Long semPKID;

    @Column(name = "semesterID", nullable = false)
    private Long semesterID;

    @Column(name = "academicYearID", nullable = false)
    private Long academicYearID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startDate")
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "Semesterstatus", nullable = false)
    private int semesterStatus;

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


    public Long getSemPKID() {
        return semPKID;
    }

    public void setSemPKID(Long semPKID) {
        this.semPKID = semPKID;
    }

    public Long getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(Long semesterID) {
        this.semesterID = semesterID;
    }

    public Long getAcademicYearID() {
        return academicYearID;
    }

    public void setAcademicYearID(Long academicYearID) {
        this.academicYearID = academicYearID;
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

    public int getSemesterStatus() {
        return semesterStatus;
    }

    public void setSemesterStatus(int semesterStatus) {
        this.semesterStatus = semesterStatus;
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
}
