package com.example.hello.service;

import com.example.hello.model.AccountRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountRoleServiceImpl implements AccountRoleService {
    @Override
    public void saveAccountRole(AccountRole accountRole) {

    }

    @Override
    public AccountRole getAccountRoleByName(String name) {
        return null;
    }

    @Override
    public boolean deleteAccountByName(String name) {
        return false;
    }

    @Override
    public List<AccountRole> getAllAccountRole() {
        return null;
    }

    @Override
    public boolean isAccountRoleExist(AccountRole account) {
        return false;
    }
}
