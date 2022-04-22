package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	
	@PostMapping
	void saveAppointment(@RequestBody Appointment appointment) {
		System.out.println(appointment.getAmount());
		System.out.println(appointment.getPreference());
		System.out.println(appointment.isPhysiotherapist());
		System.out.println(appointment.customer);
	}
}
