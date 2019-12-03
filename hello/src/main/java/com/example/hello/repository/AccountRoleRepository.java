package com.example.hello.repository;

import com.example.hello.model.AccountRole;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRoleRepository extends CassandraRepository<AccountRole, String> {
}
