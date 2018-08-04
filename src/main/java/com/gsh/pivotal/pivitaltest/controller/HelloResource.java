package com.gsh.pivotal.pivitaltest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping("morning")
    public String morningGreeting(){
        return "Good Morning";
    }
}
