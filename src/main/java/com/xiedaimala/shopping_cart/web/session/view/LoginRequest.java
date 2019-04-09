package com.xiedaimala.shopping_cart.web.session.view;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest() {
    }
}
