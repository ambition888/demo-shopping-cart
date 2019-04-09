package com.xiedaimala.shopping_cart.web.product.view;

import lombok.Data;

@Data
public class UpdateProductRequest {
    private String name;
    private String description;
    private double price;

    public UpdateProductRequest(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
