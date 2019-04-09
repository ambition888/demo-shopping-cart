package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import lombok.Data;

import java.util.List;

@Data
public class ListCartItemResponse {
    private List<CartItem> items;

    public ListCartItemResponse() {
    }

    public ListCartItemResponse(List<CartItem> items) {
        this.items = items;
    }
}
