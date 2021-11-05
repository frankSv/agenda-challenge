package com.example.agendachallenge.repository;

import com.example.agendachallenge.model.ContactInfoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactInfoTypeRepository extends JpaRepository<ContactInfoType, Integer> {

}
