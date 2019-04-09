package com.xiedaimala.shopping_cart.web.product.view;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import lombok.Data;

@Data
public class UpdateProductResponse {
    private Product product;

    public UpdateProductResponse(Product product) {
        this.product = product;
    }
}
