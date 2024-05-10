package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Trekk;
import java.util.List;


// @Repository
// @Transactional
// public interface TrekkRepository extends JpaRepository<Trekk, Integer>{

//     @Query("select t from Trekk t where id =:id")			
//     public Trekk  getTrekkById(int id);
// }
public interface TrekkRepository extends MongoRepository<Trekk, String>{

    @Query("{_id : ?0}")
    Trekk getTrekkById(String id);
}