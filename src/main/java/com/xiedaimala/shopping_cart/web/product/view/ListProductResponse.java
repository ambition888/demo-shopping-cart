package com.xiedaimala.shopping_cart.web.product.view;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class ListProductResponse {
    private List<Product> products;

    public ListProductResponse(List<Product> products) {
        this.products = products;
    }
}
