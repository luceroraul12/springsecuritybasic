package com.security.springsecuritybasic.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AcountController {

    @GetMapping
    public String account(){
        return "This is a default sentences about accounts.";
    }
}
