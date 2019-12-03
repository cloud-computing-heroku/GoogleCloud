package com.example.hello.service;

import com.example.hello.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public boolean deleteCustomerByName(String name) {
        return false;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public boolean isCustomerExist(Customer customer) {
        return false;
    }
}
