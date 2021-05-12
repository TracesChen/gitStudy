package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class helloWorld {
    @RequestMapping("/helloWorld")
    public String helloWorld(){

        return "Hello World!";
    }
}
