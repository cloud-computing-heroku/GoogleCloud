package com.example.hello.repository;

import com.example.hello.model.OrderDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends CassandraRepository<OrderDetails, String> {
}
