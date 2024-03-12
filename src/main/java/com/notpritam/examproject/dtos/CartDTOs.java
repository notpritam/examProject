package com.notpritam.examproject.dtos;

import com.notpritam.examproject.models.CartProduct;

public class CartDTOs {
    Long id;
    Long userId;
    String date;
    CartProduct[] products;

    public CartDTOs(long id, long userId, String date, CartProduct[] products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CartProduct[] getProducts() {
        return products;
    }

}
