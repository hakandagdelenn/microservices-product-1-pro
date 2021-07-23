package com.hkn.microserviceproduct.repository;

import com.hkn.microserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {


}
