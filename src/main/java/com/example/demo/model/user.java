package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            //ID
    
    @Column
    private String userName;    //USERNAME
    
    @Column
    private String password;    //PASSWORD
    
    @Column
    private String email;       //EMAIL ADRESS

    // GETTER SETTER FOR ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // GETTER SETTER FOR USERNAME
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // GETTER SETTER FOR PASSWORD
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // GETTER SETTER FOR EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
