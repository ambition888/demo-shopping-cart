package com.xiedaimala.shopping_cart.web.product.view;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import lombok.Data;

@Data
public class GetProductResponse {
    private Product product;

    public GetProductResponse(Product product) {
        this.product = product;
    }
}
