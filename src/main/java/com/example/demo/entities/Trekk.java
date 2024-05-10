package com.example.demo.entities;


import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="trekk")
@Data
// @Document(collection ="trekk")
public class Trekk {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
   // String id;

    public Trekk(){

    }
    // public Trekk(int id, String trekkName, String trekkingPoint, String city, String pickupPoint, Date trekkDate,
    //         int charges, String image) {
    //     this.id = id;
    //     this.trekkName = trekkName;
    //     this.trekkingPoint = trekkingPoint;
    //     this.city = city;
    //     this.pickupPoint = pickupPoint;
    //     this.trekkDate = trekkDate;
    //     this.charges = charges;
    //     this.image = image;
    // }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getTrekkname() {
    //     return trekkName;
    // }

    // public void setTrekkname(String trekkname) {
    //     this.trekkName = trekkname;
    // }

    // public String getTrekkingPoint() {
    //     return trekkingPoint;
    // }

    // public void setTrekkingPoint(String trekkingPoint) {
    //     this.trekkingPoint = trekkingPoint;
    // }

    // public String getCity() {
    //     return city;
    // }

    // public void setCity(String city) {
    //     this.city = city;
    // }

    // public String getPickupPoint() {
    //     return pickupPoint;
    // }

    // public void setPickupPoint(String pickupPoint) {
    //     this.pickupPoint = pickupPoint;
    // }

    // public Date getTrekkDate() {
    //     return trekkDate;
    // }

    // public void setTrekkDate(Date trekkDate) {
    //     this.trekkDate = trekkDate;
    // }

    // public int getCharges() {
    //     return charges;
    // }

    // public void setCharges(int charges) {
    //     this.charges = charges;
    // }

    // public String getImage() {
    //     return image;
    // }

    // public void setImage(String image) {
    //     this.image = image;
    // }

    @Column
    String trekkName;

    @Column
    String trekkingPoint;

    @Column
    String city;

    @Column
    String pickupPoint;

    @Column 
    Date trekkDate;

    @Column 
    int charges;

    @Column
    String image;

}
