package com.example.demo.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
public class post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                //ID
    
    @NotBlank
    @Column
    private String title;           //BLOG TITLE    
    
    @Lob
    @Column
    @NotEmpty
    private String content;         //BLOG CONTENT
    
    @Column
    private Instant createdOn;      //TIME BLOG CREATED ON
    
    @Column
    private Instant updatedOn;      //TIME BLOG UPDATED ON
    
    @Column
    @NotBlank
    private String username;        //USERNAME

    // GETTER SETTER FOR ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // GETTER SETTER TITLE
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // GETTER SETTER FOR CONTENT
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // GETTER SETTER FOR CREATED ON
    public Instant getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    // GETTER SETTER FOR UPDATED ON
    public Instant getUpdatedOn() {
        return updatedOn;
    }
    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    // GETTER SETTER FOR USERNAME
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}