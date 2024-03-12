package com.notpritam.examproject.controllers;

import com.notpritam.examproject.models.Cart;
import com.notpritam.examproject.services.FakeStoreCartServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartControllers {

    FakeStoreCartServices fakeStoreCartServices = new FakeStoreCartServices();
    @GetMapping("")
    public List<Cart> getAllCart() {
        return fakeStoreCartServices.getAllCarts();
    }
    @GetMapping("/add")
    public String addProductToCart() {
        return "Product Added to Cart";
    }
}
