package com.example.hello.request;

import java.util.Date;
import java.util.UUID;

public class ShiperRequest {

    private UUID id;

    private String fullname;

    private String phone;

    private String gender;

    private String mail;

    private Date createdAt;

    public ShiperRequest() {
    }

    public ShiperRequest(UUID id, String fullname, String phone, String gender, String mail, Date createdAt) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.gender = gender;
        this.mail = mail;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
