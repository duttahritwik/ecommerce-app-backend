package com.addToCart.addToCart.service;

import com.addToCart.addToCart.entity.Cart;
import com.addToCart.addToCart.entity.CartDetails;
import com.addToCart.addToCart.entity.Product;
import com.addToCart.addToCart.repository.AddToCartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.UUID;

public class AddToCartService {

    @Autowired
    private AddToCartRepository addToCartRepository;

    @Autowired
    private ProductDetailsProxy productDetailsProxy;

    public void addItemToCartService(Cart cart) {
        addToCartRepository.save(cart);
    }

    public void removeItemFromCartService(Cart cart) {
        addToCartRepository.delete(cart);
    }

    public CartDetails displayAllProductsInCart(UUID userID) {

        CartDetails cartDetails = new CartDetails();
        cartDetails.setUserID(userID);

        ArrayList<Cart> cartList = addToCartRepository.findByUserID(userID);
        ArrayList<Product> productList = new ArrayList<Product>();

        for(int i = 0; i < cartList.size(); i++) {
            Product product = productDetailsProxy.searchProduct(cartList.get(i).getProductID());
            productList.add(product);
        }

        cartDetails.setProductList(productList);
        return cartDetails;

    }
}
