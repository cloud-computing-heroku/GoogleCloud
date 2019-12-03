package com.example.hello.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("shiper")
public class Shiper {
    @Column("id")
    @CassandraType(type = DataType.Name.UUID)
    @PrimaryKey("id")
    private UUID id;

    @Column("fullname")
    private String fullname;

    @Column("phone")
    private String phone;

    @Column("gender")
    private String gender;

    @Column("mail")
    private String mail;

    @Column("created_at")
    private Date createdAt;

    public Shiper() {
    }

    public Shiper(UUID id, String fullname, String phone, String gender, String mail, Date createdAt) {
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
