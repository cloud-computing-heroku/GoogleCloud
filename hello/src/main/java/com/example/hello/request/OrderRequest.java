package com.example.hello.request;

import java.util.Date;
import java.util.UUID;

public class OrderRequest {

    private UUID id;

    private String customerId;

    private String shiperId;

    private String statusId;

    private String note;

    private double total;

    private Date createdAt;

    public OrderRequest() {
    }

    public OrderRequest(UUID id, String customerId, String shiperId, String statusId, String note, double total, Date createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.shiperId = shiperId;
        this.statusId = statusId;
        this.note = note;
        this.total = total;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShiperId() {
        return shiperId;
    }

    public void setShiperId(String shiperId) {
        this.shiperId = shiperId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
