package com.example.hello.service;

import com.example.hello.model.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Override
    public void saveOrderDetails(OrderDetails orderDetails) {

    }

    @Override
    public OrderDetails getOrderDetailsId(UUID uuid) {
        return null;
    }

    @Override
    public boolean deleteOrderDetailsById(UUID uuid) {
        return false;
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return null;
    }

    @Override
    public boolean isOrderDetailsExist(OrderDetails orderDetails) {
        return false;
    }
}
