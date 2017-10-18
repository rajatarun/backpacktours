package com.backpack.backpacktours.service;

import com.backpack.backpacktours.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Map;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginInfo = new LoginRepository();
    public DeferredResult<?> login(){

         return loginInfo.fetchloginDataFromDatabase();
    }

    public Map<String, Object>  getUserDetails(String userId) {
        return loginInfo.fetchUserInfoFromDatabase(userId);
    }
    public boolean authenticateUser(String userId){
        try {
            Map<String, Object> response = loginInfo.fetchUserInfoFromDatabase(userId);
            if(response.containsValue(userId)){
                return true;
            }
            return false;
        }
        catch(Exception e){
            return false;
        }

    }
}
