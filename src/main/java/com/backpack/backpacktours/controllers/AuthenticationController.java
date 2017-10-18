package com.backpack.backpacktours.controllers;

import com.backpack.backpacktours.model.User;
import com.backpack.backpacktours.service.LoginService;
import com.backpack.backpacktours.service.RegistrationService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.http.MediaType;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    @Autowired
    LoginService loginService;
    @Autowired
    RegistrationService registrationService;
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public DeferredResult<?> login(@RequestBody String userId ){
        DeferredResult<ResponseEntity<?>> response = new DeferredResult<>();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin","*");
        response.setResult(new ResponseEntity<Boolean>(loginService.authenticateUser(userId), responseHeaders, HttpStatus.OK));
        return response;
    }

    @RequestMapping(value="/register",method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<?> register(@RequestBody Map<String,String> user){
        DeferredResult<ResponseEntity<?>> response = new DeferredResult<>();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin","*");
        response.setResult(new ResponseEntity<String>(registrationService.postDataToDatabase(new User(user.get("USERID"),user.get("NAME"),user.get("DOB"),user.get("PASSWORD"))), responseHeaders, HttpStatus.OK));
        return response;
    }

    @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public DeferredResult<?> getUser(@RequestParam(value = "userId") String userId){
        DeferredResult<ResponseEntity<?>> response = new DeferredResult<>();

        response.setResult(new ResponseEntity<Map<String, Object> >(loginService.getUserDetails(userId), HttpStatus.OK));
        return response;
    }
}
