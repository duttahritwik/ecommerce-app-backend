package com.example.productservice.productservice.service;

import com.example.productservice.productservice.entity.Product;
import com.example.productservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveProductDataToDB(Product product) {
        product.setProductID(UUID.randomUUID());
        return productRepository.save(product);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductByID(UUID productID) {
        return productRepository.findByProductID(productID);

    }
}
