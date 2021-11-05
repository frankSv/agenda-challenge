package com.example.agendachallenge.service;

import com.example.agendachallenge.model.Email;
import com.example.agendachallenge.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private IEmailRepository emailRepository;

    public List<Email> findAll(){
        return emailRepository.findAll();
    }

    public Email create(Email email) {
        return emailRepository.save(email);
    }

    public Email update(Email email) {
        return emailRepository.save(email);
    }

    public void delete(Integer id) {
        emailRepository.deleteById(id);
    }

}
