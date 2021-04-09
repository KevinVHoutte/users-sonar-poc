package com.kvh.users.adapters.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/users/1")
    public UserResource getUser(){
        return new UserResource("Bob");
    }
}
