package com.sns.msbackend.user.base.controller;

import com.sns.msbackend.user.base.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class BaseController {

    private final BaseService baseService;

    @GetMapping(value = "/")
    public String get(){
        return "Success";
    }

    @GetMapping(value = "/getAll")
    public String getAllUser(){
        this.baseService.processGetAll();
        return "Success get all user";
    }
}
