package com.backpack.backpacktours.service;

import com.backpack.backpacktours.Repository.RegistrationRepository;
import com.backpack.backpacktours.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public String postDataToDatabase(User user){
        String response;
        try{
            response = registrationRepository.postuserData(user);
        }
        catch (Exception e){
            System.out.println("user = [" + e.toString() + "]");
            return "FAILED";
        }
        return response;
    }
}
