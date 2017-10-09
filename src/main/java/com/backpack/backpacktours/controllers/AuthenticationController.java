package com.backpack.backpacktours.controllers;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @RequestMapping("/login")
    public DeferredResult<?> login(){
        DeferredResult result = new DeferredResult();
        return result;
    }
}
