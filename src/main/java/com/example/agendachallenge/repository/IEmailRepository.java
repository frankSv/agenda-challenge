package com.example.agendachallenge.repository;

import com.example.agendachallenge.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmailRepository extends JpaRepository<Email, Integer> {
}
