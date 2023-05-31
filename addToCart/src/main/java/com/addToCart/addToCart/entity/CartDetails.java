package com.addToCart.addToCart.entity;

import java.util.List;
import java.util.UUID;

public class CartDetails {

    private UUID userID;
    private List<Product> productList;

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
