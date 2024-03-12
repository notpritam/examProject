package com.notpritam.examproject.services;

import com.notpritam.examproject.dtos.CartDTOs;
import com.notpritam.examproject.models.Cart;
import com.notpritam.examproject.models.CartProduct;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

public class FakeStoreCartServices implements  CartServices {
    private final String url = "https://fakestoreapi.com/carts";
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<Cart> getAllCarts() {

        List<CartDTOs> cartFetchDTOS = restTemplate.exchange(
                url ,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDTOs>>() {
                }
        ).getBody();

        List<Cart> carts = cartFetchDTOS.stream().map(dto -> {
            Cart cart = new Cart();
            cart.setCartId(dto.getId());
            cart.setUserId(dto.getUserId());
            cart.setDate(dto.getDate());
//            cart.setCartProducts(dto.getProducts());
            return cart;
        }).collect(Collectors.toList());

        return carts;

    }

    @Override
    public Cart getCart(Long id) {

        CartDTOs fakeStoreProductDto =  restTemplate.getForObject(
                url +"/" + id,
                CartDTOs.class
        );

        Cart cart = new Cart();
        cart.setCartId(fakeStoreProductDto.getId());
        cart.setUserId(fakeStoreProductDto.getUserId());
        cart.setDate(fakeStoreProductDto.getDate());
        cart.setCartProducts(fakeStoreProductDto.getProducts());
        return cart;
    }


    @Override
    public List<Cart> getLimitCart(Long limit) {

        List<CartDTOs> cartFetchDTOS = restTemplate.exchange(
                url + "?limit=" + limit,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDTOs>>() {
                }
        ).getBody();

        List<Cart> carts = cartFetchDTOS.stream().map(dto -> {
            Cart cart = new Cart();
            cart.setCartId(dto.getId());
            cart.setUserId(dto.getUserId());
            cart.setDate(dto.getDate());
//            cart.setCartProducts(dto.getProducts());
            return cart;
        }).collect(Collectors.toList());

        return carts;
    }

    @Override
    public List<Cart> getCartInDateRange(String startDate, String endDate) {

        List<CartDTOs> cartFetchDTOS = restTemplate.exchange(
                url + "?startDate=" + startDate + "&endDate=" + endDate,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDTOs>>() {
                }
        ).getBody();

        List<Cart> carts = cartFetchDTOS.stream().map(dto -> {
            Cart cart = new Cart();
            cart.setCartId(dto.getId());
            cart.setUserId(dto.getUserId());
            cart.setDate(dto.getDate());
//            cart.setCartProducts(dto.getProducts());
            return cart;
        }).collect(Collectors.toList());

        return carts;
    }

    @Override
    public List<Cart> getUserCarts(Long userId) {

        List<CartDTOs> cartFetchDTOS = restTemplate.exchange(
                url + "/user/" + userId,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDTOs>>() {
                }
        ).getBody();

        List<Cart> carts = cartFetchDTOS.stream().map(dto -> {
            Cart cart = new Cart();
            cart.setCartId(dto.getId());
            cart.setUserId(dto.getUserId());
            cart.setDate(dto.getDate());
//            cart.setCartProducts(dto.getProducts());
            return cart;
        }).collect(Collectors.toList());

        return carts;
    }

   @Override
    public Cart addNewCartProduct(Cart cart) {

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
        List<CartDTOs> cartFetchDTOS = restTemplate.exchange(
                url + "?sort=" + sort,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDTOs>>() {
                }
        ).getBody();

        List<Cart> carts = cartFetchDTOS.stream().map(dto -> {
            Cart cart = new Cart();
            cart.setCartId(dto.getId());
            cart.setUserId(dto.getUserId());
            cart.setDate(dto.getDate());
//            cart.setCartProducts(dto.getProducts());
            return cart;
        }).collect(Collectors.toList());

        return carts;
    }


}
