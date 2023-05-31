package com.addToCart.addToCart.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.UUID;

public class Cart {

    @Id
    @GeneratedValue
    private long id;

    private UUID userID;
    private UUID productID;

    public Cart() {
    }

    public Cart(long id, UUID userID, UUID productID) {
        this.id = id;
        this.userID = userID;
        this.productID = productID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
        this.productID = productID;
    }
}
