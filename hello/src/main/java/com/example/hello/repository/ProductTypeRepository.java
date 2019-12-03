package com.example.hello.repository;

import com.example.hello.model.ProductType;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CassandraRepository<ProductType, String> {
}
