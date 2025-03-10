package com.encoders.hat.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HelloWord {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
