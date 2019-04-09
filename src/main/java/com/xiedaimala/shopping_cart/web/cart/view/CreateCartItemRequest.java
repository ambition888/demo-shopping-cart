package com.xiedaimala.shopping_cart.web.cart.view;

import lombok.Data;

@Data
public class CreateCartItemRequest {
    private long userId;
    private long productId;
    private long quantity;

    public CreateCartItemRequest() {}

    public CreateCartItemRequest(long userId, long productId, long quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
