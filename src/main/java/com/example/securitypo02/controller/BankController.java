package com.example.securitypo02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/contactUs")
    public String contactUs(){
        return "you can contact us at : 843461034611";
    }
    @GetMapping("/transfer")
    public String transferMoney(){
        return "money transfer successful..";
    }
    @GetMapping("/admin")
    public String admin(){
        return "welcome admin";
    }
    @GetMapping("/about")
    public String about(){
        return "Motilal Gupta founder of Laxmi Chit Fund";
    }

}
