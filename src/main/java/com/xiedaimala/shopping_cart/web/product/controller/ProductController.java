package com.xiedaimala.shopping_cart.web.product.controller;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.product.model.ProductDao;
import com.xiedaimala.shopping_cart.web.product.view.GetProductResponse;
import com.xiedaimala.shopping_cart.web.product.view.ListProductResponse;
import com.xiedaimala.shopping_cart.web.product.view.UpdateProductRequest;
import com.xiedaimala.shopping_cart.web.product.view.UpdateProductResponse;
import com.xiedaimala.shopping_cart.web.product.view.create.CreateProductRequest;
import com.xiedaimala.shopping_cart.web.product.view.create.CreateProductResponse;
import com.xiedaimala.shopping_cart.web.product.view.create.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductDao productDao;
    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator, ProductDao productDao) {
        this.createProductRequestValidator = createProductRequestValidator;
        this.productDao = productDao;
    }

    @GetMapping("/products")
    public ResponseEntity<ListProductResponse> listProducts() {
        List<Product> products = productDao.findAll();
        return new ResponseEntity<>(new ListProductResponse(products), HttpStatus.OK);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable long productId) {
        Product product = productDao.getById(productId);

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(new GetProductResponse(product), HttpStatus.OK);
        }
    }

    @PostMapping("/products")
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        // 实现
        boolean validate = createProductRequestValidator.validate(createProductRequest);

        Product product = productDao.save(new Product(createProductRequest.getName(), createProductRequest.getDescription(), createProductRequest.getPrice()));
        return new ResponseEntity<>(new CreateProductResponse(product), HttpStatus.CREATED);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable long productId, @RequestBody UpdateProductRequest updateProductRequest) {
        Product product = productDao.getById(productId);

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        product.setName(updateProductRequest.getName());
        product.setDescription(updateProductRequest.getDescription());
        product.setPrice(updateProductRequest.getPrice());
        product = productDao.save(product);

        return new ResponseEntity<>(new UpdateProductResponse(product), HttpStatus.OK);
    }
}
