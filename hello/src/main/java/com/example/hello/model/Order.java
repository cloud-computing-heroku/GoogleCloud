package com.example.hello.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("orders")
public class Order {
    @Column("id")
    @PrimaryKey("id")
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;

    @Column("customer_id")
    private String customerId;

    @Column("shiper_id")
    private String shiperId;

    @Column("status_id")
    private String statusId;

    @Column("note")
    private String note;

    @Column("total")
    private double total;

    @Column("created_at")
    private Date createdAt;

    public Order() {
    }

    public Order(UUID id, String customerId, String shiperId, String statusId, String note, double total, Date createdAt) {
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
