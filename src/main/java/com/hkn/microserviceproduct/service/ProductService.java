package com.hkn.microserviceproduct.service;

import com.hkn.microserviceproduct.model.Product;
import com.hkn.microserviceproduct.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Product saveProduct(Product product){

        product.setCreateTime(LocalDateTime.now());
        return iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId){
        iProductRepository.deleteById(productId);
    }

    @Override
    public List<Product> productList(){
        return iProductRepository.findAll();
    }

}
