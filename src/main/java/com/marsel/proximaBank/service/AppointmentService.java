package com.marsel.proximaBank.service;

import java.util.List;

import com.marsel.proximaBank.domain.Appointment;

public interface AppointmentService {
    
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
