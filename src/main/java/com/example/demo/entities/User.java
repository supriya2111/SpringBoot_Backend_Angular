package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Supriya
 */
@Entity
@Table(name="user")
@Data
//  @Document(collection="user")
public class User {
 
     @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      int userid;

    // @Id
    // String id;

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
