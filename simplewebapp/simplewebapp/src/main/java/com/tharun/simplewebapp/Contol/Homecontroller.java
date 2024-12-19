package com.tharun.simplewebapp.Contol;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller
{
    @RequestMapping("/")
    public String greet(){
        return "hello world";
    }
    @RequestMapping("/ about")
    public String greet1() {
        return "hlooo everyone";
    }
}
