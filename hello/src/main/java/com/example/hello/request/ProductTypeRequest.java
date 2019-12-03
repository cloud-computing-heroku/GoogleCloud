package com.example.hello.request;

import java.util.Date;
import java.util.UUID;

public class ProductTypeRequest {

    private UUID id;

    private String name;

    private String unit;

    private Date createdAt;

    public ProductTypeRequest() {
    }

    public ProductTypeRequest(UUID id, String name, String unit, Date createdAt) {
        this.id = id;
        this.name = name;
        this.unit = unit;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
