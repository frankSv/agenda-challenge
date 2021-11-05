package com.example.agendachallenge.service;

import com.example.agendachallenge.model.ContactInfoType;
import com.example.agendachallenge.repository.IContactInfoTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactInfoTypeService {
    @Autowired
    private IContactInfoTypeRepository infoTypeRepository;

    public List<ContactInfoType> infoTypes(){
        return infoTypeRepository.findAll();
    }

    public ContactInfoType create(ContactInfoType infoType){
        return infoTypeRepository.save(infoType);
    }

    public ContactInfoType update(ContactInfoType infoType) {
        return infoTypeRepository.save(infoType);
    }

    public void delete(Integer id){
        infoTypeRepository.deleteById(id);
    }
}
