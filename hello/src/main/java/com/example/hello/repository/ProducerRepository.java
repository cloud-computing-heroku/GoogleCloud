package com.example.hello.repository;

import com.example.hello.model.Producer;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends CassandraRepository<Producer, String> {
}
