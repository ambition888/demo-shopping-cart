package com.xiedaimala.shopping_cart.web.product.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Long> {
    Product getById(long id);

    List<Product> findAll();

    Product save(Product product);
}
