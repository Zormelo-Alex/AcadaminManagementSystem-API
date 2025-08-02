package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "repetition")
public class Repetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repetitionID")
    private Long repetitionID;

    @Column(name = "academicYearID", nullable = false)
    private Long academicYearID;

    @Column(name = "studentID", nullable = false, length = 50)
    private String studentID;

    @Column(name = "repetitionStatus", nullable = false)
    private int repetitionStatus;

    @Column(name = "groupID")
    private Long groupID;

    @Column(name = "createdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdate;

    @Column(name = "createuserid")
    private Long createuserid;

    @Column(name = "lastupdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdated;

    @Column(name = "updateuserid")
    private Long updateuserid;

    @Column(name = "statusFlag")
    private Integer statusFlag = 1;

    // Getters and setters

    public Long getRepetitionID() {
        return repetitionID;
    }

    public void setRepetitionID(Long repetitionID) {
        this.repetitionID = repetitionID;
    }

    public Long getAcademicYearID() {
        return academicYearID;
    }

    public void setAcademicYearID(Long academicYearID) {
        this.academicYearID = academicYearID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getRepetitionStatus() {
        return repetitionStatus;
    }

    public void setRepetitionStatus(int repetitionStatus) {
        this.repetitionStatus = repetitionStatus;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    public Long getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Long updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }
}
