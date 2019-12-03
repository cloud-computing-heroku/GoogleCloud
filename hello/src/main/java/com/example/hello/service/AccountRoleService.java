package com.example.hello.service;

import com.example.hello.model.AccountRole;

import java.util.List;

public interface AccountRoleService {
    void saveAccountRole(AccountRole accountRole);

    AccountRole getAccountRoleByName (String name);

    boolean deleteAccountByName (String name);

    List<AccountRole> getAllAccountRole();

    boolean isAccountRoleExist(AccountRole account);
}
