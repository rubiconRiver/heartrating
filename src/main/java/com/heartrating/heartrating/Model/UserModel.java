package com.heartrating.heartrating.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private UUID authCode;

    public UserModel(String name, String password) {
        this.name = name;
        this.password = password;
        this.authCode = UUID.randomUUID();
    }

    public String getPassword() {
        return password;
    }

    public UUID getAuthCode() {
        return authCode;
    }

    public String getName() {
        return name;
    }


}
