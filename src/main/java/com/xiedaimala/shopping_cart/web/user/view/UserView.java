package com.xiedaimala.shopping_cart.web.user.view;

import lombok.Data;

@Data
public class UserView {
    private long id;
    private String name;

    public UserView() {}

    public UserView(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
