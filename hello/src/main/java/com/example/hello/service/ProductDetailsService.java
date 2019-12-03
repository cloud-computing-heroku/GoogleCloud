package com.example.hello.service;

import com.example.hello.model.ProductDetails;

import java.util.List;

public interface ProductDetailsService {
    void saveProductDetails(ProductDetails productDetails);

    ProductDetails getProductDetailsById(String id);

    boolean deleteProductDetailsById(String id);

    List<ProductDetails> getAllProductDetails();

    boolean isProductDetailsExist(ProductDetails productDetails);
}
