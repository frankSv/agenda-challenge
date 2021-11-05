package com.example.agendachallenge.service;

import com.example.agendachallenge.model.Appointment;
import com.example.agendachallenge.repository.IAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {
    @Autowired
    private IAppointmentRepository iAppointmentRepo;

    public List<Appointment> findAll(){
        return iAppointmentRepo.findAll();
    }

    public Appointment create(Appointment appointment){
        return iAppointmentRepo.save(appointment);
    }

    public Appointment update(Appointment appointment){
        return  iAppointmentRepo.save(appointment);
    }

    public void delete(Integer id){
        iAppointmentRepo.deleteById(id);
    }
}
