package com.example.demo.entity;

public class User {
    private Long id;
    private String username;
    private String password;
    private String role; // Could be a comma-separated string of roles like "ROLE_USER,ROLE_ADMIN"

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters
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

    public String getRoles() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Overriding toString for logging/debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", roles='" + role + '\'' +
                '}';
    }
}

