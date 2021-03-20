package com.lopez.rafael.controller;

import com.lopez.rafael.model.User;
import com.lopez.rafael.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public Principal login(Principal user) {
        return user;
    }

    @PutMapping("/admin")
    public void changePassword(@RequestBody User user) {
        userService.changePassword(user.getUsername(), user.getPassword());
    }
}
