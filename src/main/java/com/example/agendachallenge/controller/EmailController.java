package com.example.agendachallenge.controller;

import com.example.agendachallenge.model.Email;
import com.example.agendachallenge.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mails")
public class EmailController {
    @Autowired
    private EmailService service;

    @GetMapping
    public List<Email> findAll(){
        //Returns the List of all Emails
        return service.findAll();
    }

    @PostMapping
    public Email create(@RequestBody Email email){
        //Creates an Email
        return service.create(email);
    }

    @PutMapping
    public Email update(@RequestBody Email email){
        //Updates an Email
        return service.create(email);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        //Deletes an Email by Id
        service.delete(id);
    }

}
