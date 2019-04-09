package com.xiedaimala.shopping_cart.web.user.view;

import lombok.Data;

@Data
public class CreateUserResponse {
    public UserView user;

    public CreateUserResponse() {}

    public CreateUserResponse(UserView user) { this.user = user; }
}
