package com.xiedaimala.shopping_cart.web.session.model;

import lombok.Data;

@Data
public class Session {
    private long userId;
    private String token;

    public Session() {
    }

    public Session(long userId, String token) {
        this.userId = userId;
        this.token = token;
    }
}
