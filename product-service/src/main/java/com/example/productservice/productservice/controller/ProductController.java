package com.example.productservice.productservice.controller;

import com.example.productservice.productservice.entity.Product;
import com.example.productservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ecommerce-app/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProductDataToDB(product);
    }

    @GetMapping("getAllproducts")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/search/{productID}")
    public Product searchProduct(@PathVariable UUID productID) {
        return productService.getProductByID(productID);
    }
}
