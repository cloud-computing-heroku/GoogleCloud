package com.example.hello.request;

import java.util.UUID;

public class AccountRoleRequest {

    private UUID id;

    private String username;

    private String rolename;

    public AccountRoleRequest() {
    }

    public AccountRoleRequest(UUID id, String username, String rolename) {
        this.id = id;
        this.username = username;
        this.rolename = rolename;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
