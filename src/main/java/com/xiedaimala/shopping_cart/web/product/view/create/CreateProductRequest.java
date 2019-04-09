package com.xiedaimala.shopping_cart.web.product.view.create;

import lombok.Data;

@Data
public class CreateProductRequest {
    private String name;
    private String description;
    private double price;

    public CreateProductRequest() {
    }

    public CreateProductRequest(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
