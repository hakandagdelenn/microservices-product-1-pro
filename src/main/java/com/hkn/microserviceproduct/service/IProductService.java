package com.hkn.microserviceproduct.service;

import com.hkn.microserviceproduct.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> productList();
}
