package com.example.agendachallenge.service;

import com.example.agendachallenge.model.ContactType;
import com.example.agendachallenge.repository.IContactTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactTypeService {

    @Autowired
    private IContactTypeRepository iContactTypeRepo;

    public List<ContactType> findAll(){
        return iContactTypeRepo.findAll();
    }

    public ContactType create(ContactType contactType){
        return iContactTypeRepo.save(contactType);
    }

    public ContactType update(ContactType contactType) {
        return iContactTypeRepo.save(contactType);
    }

    public void delete(Integer id){
        iContactTypeRepo.deleteById(id);
    }
}
