package com.example.agendachallenge.controller;

import com.example.agendachallenge.model.Phone;
import com.example.agendachallenge.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/phones")
public class PhoneController {
    @Autowired
    private PhoneService service;

    @GetMapping
    public List<Phone> findAll(){
        //Returns the List of all Phones
        return service.findAll();
    }

    @PostMapping
    public Phone create(@RequestBody Phone phone){
        //Creates a Phone
        return service.create(phone);
    }

    @PutMapping
    public Phone update(@RequestBody Phone phone){
        //Updates a Phone
        return service.update(phone);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        //Deletes a Phone
        service.delete(id);
    }

}
