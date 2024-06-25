package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Trekk;

import java.util.Date;
import java.util.List;

////MySQL Repository
@Repository
@Transactional
public interface TrekkRepository extends JpaRepository<Trekk, Integer>{

       // Query for getting particular trekk
      @Query("select t from Trekk t where id =:id")			
      public Trekk  getTrekkById(int id);

      //  Query for updating particular trekk
      @Modifying
      @Query("UPDATE Trekk t SET t.trekkName = :trekkName, t.trekkingPoint = :trekkingPoint, t.city = :city, t.pickupPoint = :pickupPoint, t.trekkDate = :trekkDate, t.charges = :charges, t.image = :image WHERE t.id = :id")
      public int updateTrekkDataById(int id, String trekkName, String trekkingPoint, String city, String pickupPoint, Date trekkDate, int charges, String image);
}

//MongoDB Repository
// @Repository
// public interface TrekkRepository extends MongoRepository<Trekk, String>{

//     @Query("{_id : ?0}")
//     Trekk getTrekkById(String id);

// }