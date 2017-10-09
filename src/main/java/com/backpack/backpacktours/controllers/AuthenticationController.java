package com.backpack.backpacktours.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @RequestMapping("/login")
    public Map<String,Object> login(){
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("hello","world");
        return userMap;
    }
}
