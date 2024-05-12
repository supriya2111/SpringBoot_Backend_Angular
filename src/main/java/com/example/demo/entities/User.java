package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userid;

    @Column
    String firstname;

    @Column
    String lastname;

    @Column 
    String emailid;

    @Column
    String contact;

    @Column 
    String username;

    @Column 
    String password;

}
