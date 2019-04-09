package com.xiedaimala.shopping_cart.web.cart.view;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
    private long quantity;

    public UpdateCartItemRequest() {
    }

    public UpdateCartItemRequest(long quantity) {
        this.quantity = quantity;
    }
}
