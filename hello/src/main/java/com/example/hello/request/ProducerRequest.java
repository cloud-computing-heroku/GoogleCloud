package com.example.hello.request;

import java.util.Date;
import java.util.UUID;

public class ProducerRequest {

    private UUID id;

    private String name;

    private String country;

    private Date createdAt;

    public ProducerRequest() {
    }

    public ProducerRequest(UUID id, String name, String country, Date createdAt) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
