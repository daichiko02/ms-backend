package com.sns.msbackend.user.controller;

import com.sns.msbackend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/getAll")
    public String getAllUser(){
        userService.getUser();
        return "Success";
    }
}
