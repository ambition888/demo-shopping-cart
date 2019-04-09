package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import lombok.Data;

@Data
public class CreateCartItemResponse {
    CartItem item;

    public CreateCartItemResponse() {
    }

    public CreateCartItemResponse(CartItem item) {
        this.item = item;
    }
}
