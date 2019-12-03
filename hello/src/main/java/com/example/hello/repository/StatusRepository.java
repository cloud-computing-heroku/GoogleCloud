package com.example.hello.repository;

import com.example.hello.model.Status;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CassandraRepository<Status, String> {
}
