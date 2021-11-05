package com.example.agendachallenge.repository;

import com.example.agendachallenge.model.AppointmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentTypeRepository extends JpaRepository<AppointmentType, Integer> {
}
