package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import pojo.CommonUser;


@RestController
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService uservice;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user) {
       
        return uservice.saveUser(user);
    }

    @PostMapping("/login")
    public boolean validateUser(@RequestBody CommonUser user) {
        System.out.println(user.getUsername()+" "+user.getPassword());
        User authenticatedUser= uservice.validateUser(user.getUsername(),user.getPassword());
        System.out.println(authenticatedUser);
        if(authenticatedUser == null)
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    

}
