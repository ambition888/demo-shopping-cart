package com.xiedaimala.shopping_cart.web.order.view;

import com.xiedaimala.shopping_cart.web.order.model.Order;
import lombok.Data;

@Data
public class CreateOrderResponse {
    private Order order;

    public CreateOrderResponse(Order order) {
        this.order = order;
    }
}
