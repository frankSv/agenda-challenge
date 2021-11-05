package com.example.agendachallenge.service;

import com.example.agendachallenge.model.Phone;
import com.example.agendachallenge.repository.IPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    @Autowired
    private IPhoneRepository iPhoneRepository;

    public List<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    public Phone create(Phone phone) {
        return iPhoneRepository.save(phone);
    }

    public Phone update(Phone phone) {
        return iPhoneRepository.save(phone);
    }

    public void delete(Integer id){
        iPhoneRepository.deleteById(id);
    }
}
