package com.notes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInputDataController {

    @RequestMapping("/")
    public String show(){
        return "Hello World !!";
    }
}
