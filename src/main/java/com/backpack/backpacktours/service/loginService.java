package com.backpack.backpacktours.service;

import com.backpack.backpacktours.Repository.LoginRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

@Service
public class loginService {

    public DeferredResult<?> login(){
         LoginRepository loginInfo = new LoginRepository();
         return loginInfo.fetchloginDataFromDatabase();
    }
}
