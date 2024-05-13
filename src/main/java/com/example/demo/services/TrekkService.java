package com.example.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Trekk;
import com.example.demo.repositories.TrekkRepository;

/**
 *
 * @author Supriya
 */
@Service
public class TrekkService {

    @Autowired
    TrekkRepository trepo;

    //method for saving trekk details
    //Common for both MySQL and MongoDB
    public Trekk saveTrekk(Trekk trekk) {
        return trepo.save(trekk);
    }

    //method for get all trekk details
    //Common for both
    public List<Trekk> getAllTrekk() {
        return trepo.findAll();
    }

    //For MySQL - Delete method
    // public void deleteTrekk(int id) {
    //     trepo.deleteById(id);
    //  }

    //For MongoDB -Delete method
    public void deleteTrekk(String id) {
       trepo.deleteById(id);
    }

    //For MySQL 
    // public Trekk getTrekk(int id){
    //     return trepo.getTrekkById(id);
    // }

    //For MongoDB
    public Trekk getTrekk(String id){
        return trepo.getTrekkById(id);
    }

    //For MySQL - update method
    // public int updateTrekk(Trekk trekk){
    //     int rows= trepo.updateTrekkDataById(trekk.getId(), trekk.getTrekkName(),trekk.getTrekkingPoint(),trekk.getCity(),trekk.getPickupPoint(),trekk.getTrekkDate(),trekk.getCharges(),trekk.getImage());
    //     if(rows == 0){
    //         return -1;
    //     }
    //     else{
    //         return rows;
    //     }
    // }

    
    //For MongoDB -update method
    public void updateTrekkData(Trekk trekk) {
        Optional<Trekk> optionalTrekk = trepo.findById(trekk.getId());
        System.out.println("optional trekk"+optionalTrekk);
        if (optionalTrekk.isPresent()) {
            Trekk updatedtrekk = optionalTrekk.get();
            updatedtrekk.setTrekkName(trekk.getTrekkName());
            updatedtrekk.setTrekkingPoint(trekk.getTrekkingPoint());
            updatedtrekk.setCity(trekk.getCity());
            updatedtrekk.setPickupPoint(trekk.getPickupPoint());
            updatedtrekk.setTrekkDate(trekk.getTrekkDate());
            updatedtrekk.setCharges(trekk.getCharges());
            updatedtrekk.setImage(trekk.getImage());
            trepo.save(updatedtrekk);
        } 
    }
    
}
