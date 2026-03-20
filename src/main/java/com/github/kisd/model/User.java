package com.github.kisd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
    private String userId;
    private String password;
    private String name;
    private String phoneNumber;
    @JsonProperty("admin")
    private boolean isAdmin;

    public User() {}

    public User(String userId, String password, String name, String phoneNumber, boolean isAdmin){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }
}
