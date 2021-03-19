package com.lopez.rafael.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @RequestMapping("/")
    public Principal login(Principal user) {
        return user;
    }

}
