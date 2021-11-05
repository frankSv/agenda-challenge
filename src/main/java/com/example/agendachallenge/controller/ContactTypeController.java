package com.example.agendachallenge.controller;

import com.example.agendachallenge.model.ContactType;
import com.example.agendachallenge.service.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ctypes")
public class ContactTypeController {
    @Autowired
    private ContactTypeService service;

    @GetMapping
    public List<ContactType> findAll(){
        //Returns the List of all Contact Types
        return service.findAll();
    }

    @PostMapping
    public ContactType create(@RequestBody ContactType contactType){
        //Creates a Contact Type
        return service.create(contactType);
    }

    @PutMapping
    public ContactType update(@RequestBody ContactType contactType){
        //Updates a Contact Type
        return service.update(contactType);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        //Deletes a Contact Type By Id
        service.delete(id);
    }

}
