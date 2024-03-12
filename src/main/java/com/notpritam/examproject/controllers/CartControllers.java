package com.notpritam.examproject.controllers;

import com.notpritam.examproject.models.Cart;
import com.notpritam.examproject.services.FakeStoreCartServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartControllers {

    FakeStoreCartServices fakeStoreCartServices = new FakeStoreCartServices();


    // Get Limited Cart Items
    @GetMapping("")
    public List<Cart> getLimitCart(@RequestParam("limit") Long limit) {
        return fakeStoreCartServices.getLimitCart(limit);
    }
    @GetMapping("/")
    public String getAllCart(@RequestParam("limit") Long limit) {
        return "Hello";
    }

    // Get Cart By Id
    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {

        return fakeStoreCartServices.getCart(id);
    }



}
