package com.example.productservice.productservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.math.BigInteger;
import java.util.UUID;

@Document
public class Product {
    @Id
    @GeneratedValue
    private BigInteger id;
    private UUID productID;
    private String productName;
    private String productPrice;
    private String productRating;
    private String productImageURL;

    public Product() {
    }

    public Product(BigInteger id, UUID productID, String productName, String productPrice, String productRating, String productImageURL) {
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productImageURL = productImageURL;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductRating() {
        return productRating;
    }

    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }

    public String getProductImageURL() {
        return productImageURL;
    }

    public void setProductImageURL(String productImageURL) {
        this.productImageURL = productImageURL;
    }
}
