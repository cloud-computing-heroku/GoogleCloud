package com.example.hello.service;

import com.example.hello.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    void saveProduct(Product product);

    Product getProductId(UUID uuid);

    boolean deleteProductById(UUID uuid);

    List<Product> getAllProduct();

    boolean isProductExist(Product product);
}
