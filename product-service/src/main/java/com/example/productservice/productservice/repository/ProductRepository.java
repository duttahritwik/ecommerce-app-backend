package com.example.productservice.productservice.repository;

import com.example.productservice.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {

    Product save(Product product);
    List<Product> findAll();
    Product findByProductID(UUID productID);
}
