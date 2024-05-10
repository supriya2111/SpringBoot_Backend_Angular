package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Trekk;
import com.example.demo.repositories.TrekkRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

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

    public void deleteTrekk(int id) {
        trepo.deleteById(id);
     }

    // public void deleteTrekk(String id) {
    //    trepo.deleteById(id);
    // }

    public Trekk getTrekk(int id){
        return trepo.getTrekkById(id);
    }

    // public Trekk getTrekk(String id){
    //     return trepo.getTrekkById(id);
    // }

    public int updateTrekk(Trekk trekk){
        int rows= trepo.updateTrekkDataById(trekk.getId(), trekk.getTrekkName(),trekk.getTrekkingPoint(),trekk.getCity(),trekk.getPickupPoint(),trekk.getTrekkDate(),trekk.getCharges(),trekk.getImage());
        if(rows == 0){
            return -1;
        }
        else{
            return rows;
        }
    }
}
