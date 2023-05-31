package com.addToCart.addToCart.repository;

import com.addToCart.addToCart.entity.Cart;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface AddToCartRepository extends CrudRepository<Cart, Long> {
    Cart save(Cart cart);
    void delete(Cart cart);
    ArrayList<Cart> findByUserID(UUID userID);
}
