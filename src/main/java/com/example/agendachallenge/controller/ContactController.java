package com.example.agendachallenge.controller;

import com.example.agendachallenge.model.Contact;
import com.example.agendachallenge.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping
    public List<Contact> findAll(){
        //Returns the List of all Contacts
        return service.findAll();
    }

    @PostMapping
    public Contact create(@RequestBody Contact contact){
        //Creates a Contact
        return service.create(contact);
    }

    @PutMapping
    public Contact update(@RequestBody Contact contact){
        //Updates a Contact
        return service.update(contact);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        //Deletes an Appointment by Id
        service.delete(id);
    }
}
