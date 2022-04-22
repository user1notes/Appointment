package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactUs")
public class ContactController {

	@PostMapping
	void saveMessage(@RequestBody ContactUs message) {
		System.out.println(message.getEmail());
		System.out.println(message.getMessage());
		System.out.println(message.getMobileNumber());
	}
}
