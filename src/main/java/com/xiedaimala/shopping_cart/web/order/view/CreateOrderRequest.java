package com.xiedaimala.shopping_cart.web.order.view;

import lombok.Data;

@Data
public class CreateOrderRequest {
    private long userId;
    private long productId;
    private long quantity;
    private String status;
    private String address;

    public CreateOrderRequest() {
    }

    public CreateOrderRequest(long userId, long productId, long quantity, String status, String address) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }
}
