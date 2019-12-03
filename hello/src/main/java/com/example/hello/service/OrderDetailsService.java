package com.example.hello.service;

import com.example.hello.model.OrderDetails;

import java.util.List;
import java.util.UUID;

public interface OrderDetailsService {
    void saveOrderDetails(OrderDetails orderDetails);

    OrderDetails getOrderDetailsId(UUID uuid);

    boolean deleteOrderDetailsById(UUID uuid);

    List<OrderDetails> getAllOrderDetails();

    boolean isOrderDetailsExist(OrderDetails orderDetails);
}
