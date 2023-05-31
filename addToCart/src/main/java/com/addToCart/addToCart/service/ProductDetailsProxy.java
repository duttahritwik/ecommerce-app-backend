package com.addToCart.addToCart.service;

import com.addToCart.addToCart.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "product-details", url = "localhost:8082")
public interface ProductDetailsProxy {

    @GetMapping("/ecommerce-app/products/search/{productID}")
    public Product searchProduct(@PathVariable UUID productID);

}
