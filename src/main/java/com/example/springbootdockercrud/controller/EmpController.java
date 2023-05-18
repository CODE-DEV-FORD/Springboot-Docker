package com.example.springbootdockercrud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


@RequestMapping("/api")

public class EmpController {

    @GetMapping(path = "/greets")
    public String welcomes(){return "Welcome to Spring Boot";}



}
