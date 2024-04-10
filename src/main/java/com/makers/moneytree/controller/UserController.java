package com.makers.moneytree.controller;
import com.makers.moneytree.model.User;
import com.makers.moneytree.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }
    @PostMapping("/signup")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        String responseMessage = userService.saveUser(user);
        return ResponseEntity.ok(responseMessage);
    }

    @PostMapping("/login")
    public Optional<User> findUser(@RequestBody User user) {
        return userService.findUserLogIn(user);
    }
}
