package com.xiedaimala.shopping_cart.web.order.view;

import com.xiedaimala.shopping_cart.web.order.model.Order;

import java.util.List;

public class ListOrdersResponse {
    private List<Order> orders;

    public ListOrdersResponse() {
    }

    public ListOrdersResponse(List<Order> orders) {
        this.orders = orders;
    }
}
