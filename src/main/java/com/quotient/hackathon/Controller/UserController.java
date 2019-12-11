package com.quotient.hackathon.Controller;

import com.quotient.hackathon.model.User;
import com.quotient.hackathon.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    private static Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable(value = "email") String email) {
        return userService.getUserByEmail(email);
    }
}
