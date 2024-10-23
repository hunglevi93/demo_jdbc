package com.example.demo.dto.response;

public class AuthResponse {
    private String jwt;

    // Default constructor
    public AuthResponse() {
    }

    // Parameterized constructor
    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    // Getter and setter
    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}

