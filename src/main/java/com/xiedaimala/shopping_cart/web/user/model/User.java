package com.xiedaimala.shopping_cart.web.user.model;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "password")
    private Optional<String> password;


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "user")
    private List<CartItem> cartItems;

    // public User() {}

    public User(String name, Optional<String> password) {
        this.name = name;
        this.password = password;
    }

}
