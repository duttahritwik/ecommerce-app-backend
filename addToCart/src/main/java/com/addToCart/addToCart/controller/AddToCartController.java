package com.addToCart.addToCart.controller;

import com.addToCart.addToCart.entity.Cart;
import com.addToCart.addToCart.entity.CartDetails;
import com.addToCart.addToCart.service.AddToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/ecommerce-app/addToCart/")
public class AddToCartController {

    @Autowired
    private AddToCartService addToCartService;
    @PostMapping("add")
    public void addToCart(@RequestBody Cart cart) {
        addToCartService.addItemToCartService(cart);
    }

    @DeleteMapping("remove")
    public void removeFromCart(@RequestBody Cart cart) {
        addToCartService.removeItemFromCartService(cart);
    }

    @GetMapping("show/{userID}")
    public CartDetails showItems(@PathVariable UUID userID) {
        return addToCartService.displayAllProductsInCart(userID);
    }

}
