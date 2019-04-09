package com.xiedaimala.shopping_cart.web.order.view;

import lombok.Data;

@Data
public class UpdateOrderRequest {
    private long quantity;
    private String status;
    private String address;

    public UpdateOrderRequest() {
    }

    public UpdateOrderRequest(long quantity, String status, String address) {
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }
}
