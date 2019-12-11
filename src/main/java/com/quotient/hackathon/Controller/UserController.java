package com.quotient.hackathon.Controller;

import com.quotient.hackathon.model.User;
import com.quotient.hackathon.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private static Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("users/{id}")
    public User getUserByEmail(@PathVariable(name = "id") Integer id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("users/{id}")
    public User deleteUser(@PathVariable(name = "id") Integer id) {
        return userService.deleteUser(id);
    }
}
