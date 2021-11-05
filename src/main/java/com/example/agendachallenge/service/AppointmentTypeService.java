package com.example.agendachallenge.service;

import com.example.agendachallenge.model.AppointmentType;
import com.example.agendachallenge.repository.IAppointmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentTypeService {
    @Autowired
    private IAppointmentTypeRepository appointmentTypeRepo;

    public List<AppointmentType> appointmentTypes(){
        return appointmentTypeRepo.findAll();
    }

    public AppointmentType create(AppointmentType appointmentType) {
        return appointmentTypeRepo.save(appointmentType);
    }

    public AppointmentType update(AppointmentType appointmentType) {
        return appointmentTypeRepo.save(appointmentType);
    }

    public void delete(Integer id){
        appointmentTypeRepo.deleteById(id);
    }


}
