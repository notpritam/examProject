package com.notpritam.examproject.models;

public class CartProduct {
    int productId;
    int quantity;

    public CartProduct(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int productQuantity) {
        this.quantity = productQuantity;
    }
}
