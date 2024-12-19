package com.tharun.simplewebapp.Contol;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginContoller {
    @RequestMapping("login")
    public String login(){
        return "login page is here...";
    }
}
