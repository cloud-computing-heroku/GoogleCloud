package com.example.hello.service;

import com.example.hello.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public void saveRole(Role role) {

    }

    @Override
    public Role getRoleByName(String name) {
        return null;
    }

    @Override
    public boolean deleteRoleByName(String name) {
        return false;
    }

    @Override
    public List<Role> getAllRole() {
        return null;
    }

    @Override
    public boolean isRoleExist(Role role) {
        return false;
    }
}
