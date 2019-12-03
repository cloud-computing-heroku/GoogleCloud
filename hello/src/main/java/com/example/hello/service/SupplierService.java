package com.example.hello.service;

import com.example.hello.model.Supplier;

import java.util.List;

public interface SupplierService {
    void saveSupplier(Supplier supplier);

    Supplier getSupplierByName(String name);

    boolean deleteSupplierByName(String name);

    List<Supplier> getAllSupplier();

    boolean isSupplierExist(Supplier supplier);
}
