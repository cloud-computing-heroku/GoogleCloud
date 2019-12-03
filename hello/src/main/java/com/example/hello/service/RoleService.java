package com.example.hello.service;

import com.example.hello.model.Role;

import java.util.List;

public interface RoleService {
    void saveRole(Role role);

    Role getRoleByName(String name);

    boolean deleteRoleByName(String name);

    List<Role> getAllRole();

    boolean isRoleExist(Role role);
}
