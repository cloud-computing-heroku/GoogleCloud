package com.example.hello.service;

import com.example.hello.model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);

    Customer getCustomerByName(String name);

    boolean deleteCustomerByName(String name);

    List<Customer> getAllCustomer();

    boolean isCustomerExist(Customer customer);
}
