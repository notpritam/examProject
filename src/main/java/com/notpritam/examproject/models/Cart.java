package com.notpritam.examproject.models;


public class Cart {
    private long cartId;
    private  long userId;
    private  String date;
    private  CartProduct[] cartProducts;

    public Cart(long cartId, long userId, String date, CartProduct[] cartProducts) {
        this.cartId = cartId;
        this.userId = userId;
        this.date = date;
        this.cartProducts = cartProducts;
    }

    public  Cart(){
        cartId=0;
        userId=0;
        date="";
        cartProducts = new CartProduct[0];
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
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

    public CartProduct[] getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(CartProduct[] cartProducts) {
        this.cartProducts = cartProducts;
    }
}
