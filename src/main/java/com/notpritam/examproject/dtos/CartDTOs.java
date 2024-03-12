package com.notpritam.examproject.dtos;

import com.notpritam.examproject.models.CartProduct;

public class CartDTOs {
    int id;
    int userId;
    String date;
    CartProduct[] products;

    public CartDTOs(int id, int userId, String date, CartProduct[] products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }
}
