package com.example.springArticleTest.controller;


import com.example.springArticleTest.dto.UserCreateRequest;
import com.example.springArticleTest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
public class Controller {


    private final List<User> users = new ArrayList<>();

    @PostMapping("/user")
    public void newUser(@RequestBody UserCreateRequest request) {
        users.add(new User(request.getName(), request.getAge()));





    }




}

