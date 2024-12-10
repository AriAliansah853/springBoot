package com.example.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "login_user") // Nama tabel di database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_user_id") // Nama kolom di database
    private Long id;

    @Column(name = "login_user_uid", nullable = false, unique = true) // Nama field khusus
    private String uid;

    @Column(name = "login_user_userid", nullable = false) // Nama field khusus
    private String name;

    @Column(name = "login_user_email", nullable = false, unique = true) // Nama field khusus
    private String email;
    
    

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
