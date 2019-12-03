package com.example.hello.service;

import com.example.hello.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public Product getProductId(UUID uuid) {
        return null;
    }

    @Override
    public boolean deleteProductById(UUID uuid) {
        return false;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public boolean isProductExist(Product product) {
        return false;
    }
}
