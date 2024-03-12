package com.notpritam.examproject.services;

import com.notpritam.examproject.dtos.CartDTOs;
import com.notpritam.examproject.models.Cart;
import com.notpritam.examproject.models.CartProduct;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
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

        return cartFetchDTOS.stream().map(this::mapToCart).toList();

    }

    private Cart mapToCart(CartDTOs recivedCartDTO) {

        return new Cart(recivedCartDTO.getId(), recivedCartDTO.getUserId(), recivedCartDTO.getDate(), recivedCartDTO.getProducts());
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

        return cartFetchDTOS.stream().map(this::mapToCart).toList();
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

        return cartFetchDTOS.stream().map(this::mapToCart).toList();
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


        return cartFetchDTOS.stream().map(this::mapToCart).toList();
    }

   @Override
    public Cart addNewCartProduct(Cart cart) {

           CartDTOs sendCart = mapToCardDTOs(cart);
           sendCart = restTemplate.postForObject(url, sendCart, CartDTOs.class);

           System.out.println(Arrays.stream(sendCart.getProducts()).toList());

           return mapToCart(sendCart);

    }

    private CartDTOs mapToCardDTOs(Cart cart) {

        return new CartDTOs(cart.getCartId(), cart.getUserId(), cart.getDate(), cart.getCartProducts());

    }

    @Override
    public String updateAProduct(Cart cart) {
        CartDTOs sendCart = mapToCardDTOs(cart);
        restTemplate.put(url + "/" + cart.getCartId(), sendCart, CartDTOs.class);

        return  "Updated Successfully!";
    }

    @Override
    public Cart deleteCart(Long cartId) {
       restTemplate.delete(url + "/" + cartId, CartDTOs.class);
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


        return cartFetchDTOS.stream().map(this::mapToCart).toList();
    }


}
