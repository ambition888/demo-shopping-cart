package com.xiedaimala.shopping_cart.web.order.model;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.user.model.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private long quantity;

    @Column(name = "status")
    private String status;

    @Column(name = "address")
    private String address;

    public Order() {}

    public Order(User user, Product product, long quantity, String status, String address) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }
}
