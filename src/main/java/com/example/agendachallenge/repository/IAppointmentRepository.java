package com.example.agendachallenge.repository;

import com.example.agendachallenge.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
}
