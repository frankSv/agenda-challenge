package com.example.agendachallenge.repository;

import com.example.agendachallenge.model.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactTypeRepository extends JpaRepository<ContactType, Integer> {
}
