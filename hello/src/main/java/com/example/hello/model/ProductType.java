package com.example.hello.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("product_type")
public class ProductType {
    @Column("id")
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;

    @Column("name")
    @PrimaryKey("name")
    private String name;

    @Column("unit")
    private String unit;

    @Column("created_at")
    private Date createdAt;

    public ProductType() {
    }

    public ProductType(UUID id, String name, String unit, Date createdAt) {
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
