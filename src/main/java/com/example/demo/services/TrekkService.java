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

    public Trekk saveTrekk(Trekk trekk) {
        return trepo.save(trekk);
    }

    public List<Trekk> getAllTrekk() {
        return trepo.findAll();
    }

    // public void deleteTrekk(int id) {
    //     trepo.deleteById(id);
    //  }

    public void deleteTrekk(String id) {
       trepo.deleteById(id);
    }

    // public Trekk getTrekk(int id){
    //     return trepo.getTrekkById(id);
    // }

    public Trekk getTrekk(String id){
        return trepo.getTrekkById(id);
    }

    // public int updateTrekk(Trekk trekk){
    //     int rows= trepo.updateTrekkDataById(trekk.getId(), trekk.getTrekkName(),trekk.getTrekkingPoint(),trekk.getCity(),trekk.getPickupPoint(),trekk.getTrekkDate(),trekk.getCharges(),trekk.getImage());
    //     if(rows == 0){
    //         return -1;
    //     }
    //     else{
    //         return rows;
    //     }
    // }

    
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
