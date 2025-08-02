package com.example.sams.model;


import jakarta.persistence.*;

@Entity
@Table(name = "auth_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "auth_ID")
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String username;
    @Column(name = "passwd")
    private String password;
    private String mobile;
    private String phone;
    private String linkedUserID;
    private String description;
    private Boolean isActivated;
    private Boolean accountDisabled;
    private Boolean lockedOut;
    private String accountType;
    private String secretQuestion;
    private String secretAnswer;
    private String lastLogin;
    private String changeAtNextLogon;
    private String createUserID;
    private String createDate;
    private String UpdateUserID;
    private String UpdateDate;
    private String Flag;

    // Constructors
    public User() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedUserID() {
        return linkedUserID;
    }

    public void setLinkedUserID(String linkedUserID) {
        this.linkedUserID = linkedUserID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public Boolean getAccountDisabled() {
        return accountDisabled;
    }

    public void setAccountDisabled(Boolean accountDisabled) {
        this.accountDisabled = accountDisabled;
    }

    public Boolean getLockedOut() {
        return lockedOut;
    }

    public void setLockedOut(Boolean lockedOut) {
        this.lockedOut = lockedOut;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getChangeAtNextLogon() {
        return changeAtNextLogon;
    }

    public void setChangeAtNextLogon(String changeAtNextLogon) {
        this.changeAtNextLogon = changeAtNextLogon;
    }

    public String getCreateUserID() {
        return createUserID;
    }

    public void setCreateUserID(String createUserID) {
        this.createUserID = createUserID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUserID() {
        return UpdateUserID;
    }

    public void setUpdateUserID(String updateUserID) {
        UpdateUserID = updateUserID;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String updateDate) {
        UpdateDate = updateDate;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
