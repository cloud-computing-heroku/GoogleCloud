package com.example.hello.service;

import com.example.hello.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Override
    public void saveSupplier(Supplier supplier) {

    }

    @Override
    public Supplier getSupplierByName(String name) {
        return null;
    }

    @Override
    public boolean deleteSupplierByName(String name) {
        return false;
    }

    @Override
    public List<Supplier> getAllSupplier() {
        return null;
    }

    @Override
    public boolean isSupplierExist(Supplier supplier) {
        return false;
    }
}
