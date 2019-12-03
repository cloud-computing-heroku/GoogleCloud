package com.example.hello.repository;

import com.example.hello.model.ProductDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends CassandraRepository<ProductDetails, String> {
}
