package com.security.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class LoansController {
    @GetMapping
    public String contact(){
        return "this is a default message about contact.";
    }
}
