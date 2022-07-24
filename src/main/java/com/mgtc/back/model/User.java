package com.mgtc.back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String uuid;
    private String username;
    private String email;

    public User(String uuid, String username, String email) {
        this.uuid = uuid;
        this.username = username;
        this.email = email;
    }
}
