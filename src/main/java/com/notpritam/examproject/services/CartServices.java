package com.notpritam.examproject.services;

import com.notpritam.examproject.models.Cart;
import com.notpritam.examproject.models.Product;

import java.util.List;

public interface CartServices {
    public List<Cart> getAllCarts();
    public Cart getCart(Long id);
    public List<Cart> getLimitCart(Long limit);
    public List<Cart> getCartInDateRange(String startDate , String endDate);
    public List<Cart> getUserCarts(Long userId);
    public Cart addNewCartProduct(Cart cart);
    public Cart updateAProduct(Long productId);
    public Cart deleteCart(Long cartId);
    public List<Cart> getSortedProducts(String sort);
}
