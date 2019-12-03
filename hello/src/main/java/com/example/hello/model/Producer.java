package com.example.hello.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("producer")
public class Producer {
    @Column("id")
    @CassandraType(type = DataType.Name.UUID)
    @PrimaryKey("id")
    private UUID id;

    @Column("name")
    private String name;

    @Column("country")
    private String country;

    @Column("created_at")
    private Date createdAt;

    public Producer() {
    }

    public Producer(UUID id, String name, String country, Date createdAt) {
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
