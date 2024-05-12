package com.example.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;


// @Repository
// @Transactional
// public interface UserRepository extends JpaRepository<User, Integer> {
   
//     @Query("select u from User u where username like :username and password like :password")
//     public User findByUsernameAndPassword(String username, String password);
// }

@Repository
public interface UserRepository extends MongoRepository<User, String> {
   
    @Query("{ 'username' : ?0, 'password' : ?1 }")
    public User findByUsernameAndPassword(String username, String password);
}
