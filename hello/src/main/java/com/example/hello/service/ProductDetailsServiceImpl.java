package com.example.hello.service;

import com.example.hello.model.ProductDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

    @Override
    public void saveProductDetails(ProductDetails productDetails) {

    }

    @Override
    public ProductDetails getProductDetailsById(String id) {
        return null;
    }

    @Override
    public boolean deleteProductDetailsById(String id) {
        return false;
    }

    @Override
    public List<ProductDetails> getAllProductDetails() {
        return null;
    }

    @Override
    public boolean isProductDetailsExist(ProductDetails productDetails) {
        return false;
    }
}
