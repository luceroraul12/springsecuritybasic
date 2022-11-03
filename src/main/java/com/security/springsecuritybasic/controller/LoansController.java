package com.security.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loans")
public class LoansController {
    @GetMapping
    public String loans(){
        return "this is a default message about loans.";
    }
}
