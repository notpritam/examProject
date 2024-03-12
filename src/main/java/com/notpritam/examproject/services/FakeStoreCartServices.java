package com.notpritam.examproject.services;

import com.notpritam.examproject.models.Cart;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreCartServices implements  CartServices {

    RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<Cart> getAllCarts() {

        restTemplate.getForObject("http://localhost:8080/api/carts", Cart.class);
        return null;
    }

    @Override
    public Cart getCart(Long id) {
        return null;
    }

    @Override
    public Cart getLimitCart(Long limit) {
        return null;
    }

    @Override
    public Cart getCartInDateRange(String startDate, String endDate) {
        return null;
    }

    @Override
    public void getUserCarts(Long userId) {

    }

    @Override
    public List<Cart> addNewCart(String categoryName) {
        return null;
    }

    @Override
    public List<Cart> updateAProduct(Long productId) {
        return null;
    }

    @Override
    public List<Cart> deleteCart(Long cartId) {
        return null;
    }

    @Override
    public List<Cart> getSortedProducts(String sort) {
        return null;
    }
}
