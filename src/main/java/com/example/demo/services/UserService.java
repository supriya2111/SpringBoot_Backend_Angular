package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository urepo;

    public User saveUser(User user){
        return urepo.save(user);
    }

    public User validateUser(String username,String password){
      
		User user =  urepo.findByUsernameandpassword(username, password);
	
		
		if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
		else return user;
    }

}
