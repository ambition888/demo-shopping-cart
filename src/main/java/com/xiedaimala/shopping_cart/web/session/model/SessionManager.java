package com.xiedaimala.shopping_cart.web.session.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@Component
public class SessionManager {
    private HashMap<Long, Session> sessions;

    public SessionManager() {
        this.sessions = new HashMap<>();
    }
}
