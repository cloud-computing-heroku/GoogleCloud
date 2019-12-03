package com.example.hello.request;

import java.util.Date;
import java.util.UUID;

public class ProductRequest {

    private UUID id;

    private String name;

    private String supplierName;

    private String producerName;

    private String typeName;

    private double cost;

    private double sale;

    private double remain;

    private double amount;

    private Date createdAt;

    public ProductRequest() {
    }

    public ProductRequest(UUID id, String name, String supplierName, String producerName, String typeName, double cost, double sale, double remain, double amount, Date createdAt) {
        this.id = id;
        this.name = name;
        this.supplierName = supplierName;
        this.producerName = producerName;
        this.typeName = typeName;
        this.cost = cost;
        this.sale = sale;
        this.remain = remain;
        this.amount = amount;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getRemain() {
        return remain;
    }

    public void setRemain(double remain) {
        this.remain = remain;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
