package com.makers.moneytree.controller.User;
import com.makers.moneytree.model.User.User;
import com.makers.moneytree.services.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
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
