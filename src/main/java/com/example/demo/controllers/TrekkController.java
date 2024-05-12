package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Trekk;
import com.example.demo.services.TrekkService;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins="*")
public class TrekkController {

    @Autowired
    TrekkService tservice;

    @PostMapping("trekks/add")
    public Trekk saveTrekk(@RequestBody Trekk trekk) {
        
        return tservice.saveTrekk(trekk);
    }
    
    @GetMapping("/trekks")
    public List<Trekk> getAllTrekks() {
        return tservice.getAllTrekk();
    }

    // @DeleteMapping("/trekks/{id}")
    // public void deleteTrekk(@PathVariable("id") int id)
    // {
    // 	tservice.deleteTrekk(id);
    // } 

    @DeleteMapping("/trekks/{id}")
    public void deleteTrekk(@PathVariable("id") String id)
    {
    	tservice.deleteTrekk(id);
    }


    // @GetMapping("/trekks/{id}")
    // public Trekk getTrekk(@PathVariable int id) {
    //    return tservice.getTrekk(id);
    // }
    
   
    @GetMapping("/trekks/{id}")
    public Trekk getTrekk(@PathVariable String id) {
       return tservice.getTrekk(id);
    }
    
    // @GetMapping("/trekks/update/{id}")
    // public Trekk getTrekkforUpdate(@PathVariable String id) {
    //    return tservice.getTrekk(id);
    // }

    @PutMapping("/trekks")
    public void  updateTrekk( @RequestBody Trekk trekk) {
        System.out.println(trekk);
        tservice.updateTrekkData(trekk);
    }

    
}
