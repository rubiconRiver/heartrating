package com.heartrating.heartrating.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    private UUID authCode;

    public UserModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authCode = UUID.randomUUID();
    }

    public String getPassword() {
        return password;
    }

    public UUID getAuthCode() {
        return authCode;
    }
}
