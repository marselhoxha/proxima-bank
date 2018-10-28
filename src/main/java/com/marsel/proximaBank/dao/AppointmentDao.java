package com.marsel.proximaBank.dao;

import java.util.List;

import com.marsel.proximaBank.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
