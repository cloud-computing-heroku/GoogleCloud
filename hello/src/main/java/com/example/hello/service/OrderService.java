package com.example.hello.service;

import com.example.hello.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    void saveOrder(Order order);

    Order getOrderById(UUID uuid);

    boolean deleteOrderById(UUID uuid);

    List<Order> getAllOrder();

    boolean isOrderExist(Order order);
}
