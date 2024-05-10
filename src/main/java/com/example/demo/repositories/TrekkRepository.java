package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Trekk;

import java.util.Date;
import java.util.List;


@Repository
@Transactional
public interface TrekkRepository extends JpaRepository<Trekk, Integer>{

    @Query("select t from Trekk t where id =:id")			
    public Trekk  getTrekkById(int id);

      @Modifying
      @Query("UPDATE Trekk t SET t.trekkName = :trekkName, t.trekkingPoint = :trekkingPoint, t.city = :city, t.pickupPoint = :pickupPoint, t.trekkDate = :trekkDate, t.charges = :charges, t.image = :image WHERE t.id = :id")
      public int updateTrekkDataById(int id, String trekkName, String trekkingPoint, String city, String pickupPoint, Date trekkDate, int charges, String image);
}

// public interface TrekkRepository extends MongoRepository<Trekk, String>{

//     @Query("{_id : ?0}")
//     Trekk getTrekkById(String id);

//     @Modifying
//     @Query("{$set: {trekkName : ?1, trekkingPoint : ?2, city : ?3, pickupPoint : ?4, trekkDate : ?5, charges : ?6, image : ?7}}")
//     int updateTrekkData(String id, String trekkName, String trekkingPoint, String city, String pickupPoint, Date trekkDate, int charges, String image);

// }