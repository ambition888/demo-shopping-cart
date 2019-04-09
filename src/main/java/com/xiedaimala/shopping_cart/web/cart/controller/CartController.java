package com.xiedaimala.shopping_cart.web.cart.controller;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import com.xiedaimala.shopping_cart.web.cart.model.CartItemDao;
import com.xiedaimala.shopping_cart.web.cart.view.*;
import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.product.model.ProductDao;
import com.xiedaimala.shopping_cart.web.user.model.User;
import com.xiedaimala.shopping_cart.web.user.model.UserDao;
import com.xiedaimala.shopping_cart.web.user.view.CreateUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CartController {
    private UserDao userDao;
    private ProductDao productDao;
    private CartItemDao cartItemDao;

    public CartController(UserDao userDao, ProductDao productDao, CartItemDao cartItemDao) {
        this.userDao = userDao;
        this.productDao = productDao;
        this.cartItemDao = cartItemDao;
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        Optional<Integer> op0 = Optional.ofNullable(1);
//        Optional<CartItem> op0 = Optional.ofNullable(null);
//        op0.orElseThrow();
        op0.ifPresentOrElse(CartController::test0, CartController::test1);
        System.out.println("test 流程" + op0.get());
        Optional<User> op1 = Optional.ofNullable(userDao.getById(1));
        System.out.println(op1.get());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public static void test0(Integer cartItem) {
        System.out.println("test0");
        System.out.println(cartItem);
    }

    public static ResponseEntity test1() {
        System.out.println("test1");
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/cartItems")
    public ResponseEntity<ListCartItemResponse> listCartItems() {
        List<CartItem> items = this.cartItemDao.findAll();
        return new ResponseEntity<>(new ListCartItemResponse(items), HttpStatus.OK);
    }

    @GetMapping("/cartItems/{cartItemId")
    public ResponseEntity<GetCartItemResponse> getCartItem(@PathVariable long cartItemId) {
        Optional<CartItem> cartItem = cartItemDao.getById(cartItemId);
        if (!cartItem.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new GetCartItemResponse(cartItem.get()), HttpStatus.OK);
    }

    @PostMapping("/cartItems")
    public ResponseEntity<CreateCartItemResponse> updateCartItem(@RequestBody CreateCartItemRequest createCartItemRequest) {
        User user = userDao.getById(createCartItemRequest.getUserId());
        Product product = productDao.getById(createCartItemRequest.getProductId());
        CartItem cartItem = cartItemDao.save(new CartItem(user, product, createCartItemRequest.getQuantity()));
        return new ResponseEntity<>(new CreateCartItemResponse(cartItem), HttpStatus.CREATED);
    }

    public ResponseEntity<UpdateCartItemResponse> updateCartItem(@PathVariable long cartItemId, UpdateCartItemRequest updateCartItemRequest) {
        Optional<CartItem> optional = cartItemDao.getById(cartItemId);
        if (!optional.isPresent()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        CartItem cartItem = optional.get();
        cartItem.setQuantity(updateCartItemRequest.getQuantity());
        cartItem = cartItemDao.save(cartItem);
        return new ResponseEntity<>(new UpdateCartItemResponse(cartItem), HttpStatus.OK);
    }

    public ResponseEntity deleteCartItem(@PathVariable long cartItemId) {
        Optional<CartItem> cartItem = cartItemDao.getById(cartItemId);
        // CartItem cartItem = cartItemDao.getById(cartItemId);
        if (cartItem.isPresent()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
//        Optional.ofNullable(cartItem)
        cartItemDao.delete(cartItem.get());
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


}
