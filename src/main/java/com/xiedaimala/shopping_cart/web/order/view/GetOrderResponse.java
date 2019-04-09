package com.xiedaimala.shopping_cart.web.order.view;

import com.xiedaimala.shopping_cart.web.order.model.Order;
import lombok.Data;

@Data
public class GetOrderResponse {
    private Order order;

    public GetOrderResponse() {
    }

    public GetOrderResponse(Order order) {
        this.order = order;
    }
}
