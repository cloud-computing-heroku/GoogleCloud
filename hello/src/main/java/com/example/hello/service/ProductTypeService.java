package com.example.hello.service;

import com.example.hello.model.ProductType;

import java.util.List;

public interface ProductTypeService {
    void saveProductType(ProductType productType);

    ProductType getProductTypeByName(String name);

    boolean deleteProductTypeByName(String name);

    List<ProductType> getAllProductType();

    boolean isProductTypeExist(ProductType productType);
}
