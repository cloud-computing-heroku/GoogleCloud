package com.example.hello.repository;

import com.example.hello.model.Supplier;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CassandraRepository<Supplier, String> {
}
