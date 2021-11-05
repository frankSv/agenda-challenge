package com.example.agendachallenge.controller;

import com.example.agendachallenge.model.Appointment;
import com.example.agendachallenge.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appoints")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @GetMapping
    public List<Appointment> findAll(){
        //Returns the List of all Appointments
        return service.findAll();
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment){
        //Creates an Appointment
        return service.create(appointment);
    }

    @PutMapping
    public Appointment update(@RequestBody Appointment appointment){
        //Updates an Appointment
        return service.update(appointment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        //Deletes an Appointment by Id
        service.delete(id);
    }
}
