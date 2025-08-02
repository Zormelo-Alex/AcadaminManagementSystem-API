package com.example.sams.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Course_ID")
    private Long Course_ID;

    @Column(name = "courseName", length = 350)
    private String courseName;

    @Column(name = "Description", length = 550)
    private String description;

    @Column(name = "takenSemester")
    private Integer takenSemester;

    @Column(name = "creditHours")
    private Integer creditHours;

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

    public Courses() {}

    public Long getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(Long course_ID) {
        Course_ID = course_ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTakenSemester() {
        return takenSemester;
    }

    public void setTakenSemester(Integer takenSemester) {
        this.takenSemester = takenSemester;
    }

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
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
