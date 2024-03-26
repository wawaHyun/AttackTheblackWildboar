package com.attackPig.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attackPig.api.model.Monster;

@RestController
public class Hometast {
    @RequestMapping("/")
    public String hello(){
        return "welcome to Spring Boot ! ";
    }
}
