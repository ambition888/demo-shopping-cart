package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import lombok.Data;

@Data
public class UpdateCartItemResponse {

    private CartItem item;

    public UpdateCartItemResponse() {
    }

    public UpdateCartItemResponse(CartItem item) {
        this.item = item;
    }
}
