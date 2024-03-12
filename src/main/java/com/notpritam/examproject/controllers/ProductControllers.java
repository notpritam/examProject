package com.notpritam.examproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllers {


    @GetMapping("/product")
    public String getProductName() {
        return "Enter Product Id to get Details of Product";
    }

    @GetMapping("/product/{id}")
    public String getProductDetails() {
        return "Product Details";
    }
}
