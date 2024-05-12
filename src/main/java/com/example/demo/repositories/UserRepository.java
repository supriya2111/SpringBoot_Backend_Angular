package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.User;
import java.util.List;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
   
    @Query("select u from User u where username like :username and password like :password")
    public User findByUsernameandpassword(String username, String password);
}
