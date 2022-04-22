package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	
	List<Appointment> appointments = new ArrayList<>();
	
	void saveAppointment(Appointment appointment) {
		appointments.add(appointment);
		System.out.println("Saved");
	}
}
