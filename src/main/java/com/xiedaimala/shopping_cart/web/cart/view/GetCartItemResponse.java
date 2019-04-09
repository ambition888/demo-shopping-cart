package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import lombok.Data;

@Data
public class GetCartItemResponse {
    private CartItem item;

    public GetCartItemResponse() {
    }

    public GetCartItemResponse(CartItem item) {
        this.item = item;
    }
}
