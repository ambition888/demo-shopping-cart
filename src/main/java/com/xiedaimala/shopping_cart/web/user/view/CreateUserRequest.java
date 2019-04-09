package com.xiedaimala.shopping_cart.web.user.view;

import lombok.Data;

@Data
public class CreateUserRequest {

    private String username;
    private String password;

    public CreateUserRequest() {}

    public CreateUserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
