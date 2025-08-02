package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "studentprogrammes")
public class StudentProgrammes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKID")
    private Long pkid;

    @Column(name = "studentID_old")
    private String studentIdOld;

    @Column(name = "studentID", nullable = false)
    private String studentId;

    @Column(name = "programmeID", nullable = false)
    private Long programmeId;

    @Column(name = "completionStatus", nullable = false)
    private int completionStatus;

    @Column(name = "createdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column(name = "createuserid")
    private Long createUserId;

    @Column(name = "lastupdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;

    @Column(name = "updateuserid")
    private Long updateUserId;

    @Column(name = "statusFlag")
    private Integer statusFlag;

    // Getters and Setters

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getStudentIdOld() {
        return studentIdOld;
    }

    public void setStudentIdOld(String studentIdOld) {
        this.studentIdOld = studentIdOld;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public int getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(int completionStatus) {
        this.completionStatus = completionStatus;
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

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }
}
