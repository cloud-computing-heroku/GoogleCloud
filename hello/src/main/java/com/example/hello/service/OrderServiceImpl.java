package com.example.hello.service;

import com.example.hello.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public Order getOrderById(UUID uuid) {
        return null;
    }

    @Override
    public boolean deleteOrderById(UUID uuid) {
        return false;
    }

    @Override
    public List<Order> getAllOrder() {
        return null;
    }

    @Override
    public boolean isOrderExist(Order order) {
        return false;
    }
}
