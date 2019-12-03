package com.example.hello.repository;

import com.example.hello.model.Shiper;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiperRepository extends CassandraRepository<Shiper, String> {
}
