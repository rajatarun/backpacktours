package com.backpack.backpacktours.controllers;

import com.backpack.backpacktours.model.User;
import com.backpack.backpacktours.service.LoginService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public DeferredResult<?> login(@RequestBody( required = true) User user ){
        DeferredResult<ResponseEntity<?>> response = new DeferredResult<>();
        return response;
    }

    @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public DeferredResult<?> getUser(@RequestParam(value = "userId") String userId){
        DeferredResult<ResponseEntity<?>> response = new DeferredResult<>();
        response.setResult(new ResponseEntity<Map<String, Object> >(loginService.getUserDetails(userId), HttpStatus.OK));
        return response;
    }
}
