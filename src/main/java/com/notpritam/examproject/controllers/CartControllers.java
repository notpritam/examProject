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
    @GetMapping("/limited")
    public List<Cart> getLimitCart(@RequestParam("limit") Long limit) {
        return fakeStoreCartServices.getLimitCart(limit);
    }

    // Get Sorted Cart Items
    @GetMapping("/sorted")
    public List<Cart> getSortedItems(@RequestParam("sort") String sortBy) {
        return fakeStoreCartServices.getSortedProducts(sortBy);
    }

    // Get All Cart Items
    @GetMapping("/all")
    public List<Cart> getAllCart() {
        return fakeStoreCartServices.getAllCarts();
    }

    // Get Cart Items in Date Range
    @GetMapping("/dateRange")
    public List<Cart> getAllCart(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate) {
        System.out.println(startDate + " " + endDate);
        return fakeStoreCartServices.getCartInDateRange(startDate, endDate);
    }

    // Get Cart Item By Id
    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {

        return fakeStoreCartServices.getCart(id);
    }


    //Get User Cart

    @GetMapping("/user/{userId}")
    public List<Cart> getUserCarts(@PathVariable Long userId) {
      return  fakeStoreCartServices.getUserCarts(userId);
    }

    // Add a new Product in Cart
    @PostMapping(
            value = "/createPerson", consumes = "application/json", produces = "application/json")
    public Cart createPerson(@RequestBody Cart cart) {
        return fakeStoreCartServices.addNewCartProduct(cart);
    }

}
