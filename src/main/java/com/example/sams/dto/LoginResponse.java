package com.example.sams.dto;

import com.example.sams.model.User;

public class LoginResponse {
    private String token;
    private User user;

    public LoginResponse(String token, User user) {
        this.token = token;
        this.user = user;
    }

    // Getters
    public String getToken() { return token; }
    public User getUser() { return user; }
}
