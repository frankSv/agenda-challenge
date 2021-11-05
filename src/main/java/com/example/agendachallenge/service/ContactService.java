package com.example.agendachallenge.service;

import com.example.agendachallenge.model.Contact;
import com.example.agendachallenge.repository.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {
    @Autowired
    private IContactRepository iContactRepo;

    public List<Contact> findAll(){
        return iContactRepo.findAll();
    }

    public Contact create(Contact contact){
        return iContactRepo.save(contact);
    }

    public Contact update(Contact contact){
        return iContactRepo.save(contact);
    }

    public void delete(Integer id){
        iContactRepo.deleteById(id);
    }

}
