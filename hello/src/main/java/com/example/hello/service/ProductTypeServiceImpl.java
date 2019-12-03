package com.example.hello.service;

import com.example.hello.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Override
    public void saveProductType(ProductType productType) {

    }

    @Override
    public ProductType getProductTypeByName(String name) {
        return null;
    }

    @Override
    public boolean deleteProductTypeByName(String name) {
        return false;
    }

    @Override
    public List<ProductType> getAllProductType() {
        return null;
    }

    @Override
    public boolean isProductTypeExist(ProductType productType) {
        return false;
    }
}
