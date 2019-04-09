package com.xiedaimala.shopping_cart.web.product.view.create;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import lombok.Data;

@Data
public class CreateProductResponse {
    private Product product;

    public CreateProductResponse() {
    }

    public CreateProductResponse(Product product) {
        this.product = product;
    }
}
