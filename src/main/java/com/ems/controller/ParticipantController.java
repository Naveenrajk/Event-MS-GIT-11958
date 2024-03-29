package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.bean.Participant;

import com.ems.service.ParticipantService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ParticipantController {

	@Autowired
	ParticipantService service;

	@PostMapping("/performParticipantInsert")
	public void performInsert(@RequestBody Participant participant) {
		service.insertParticipant(participant);
		
	}

	@PutMapping("/performParticipantUpdate")
	public void performUpdate(@RequestBody Participant participant) {
		service.insertParticipant(participant);
	}
	
	@DeleteMapping("/performParticipantDelete/{email}")
	public void perfromDelete(@PathVariable("email") String email) {
		service.deleteParticipant(email);
	}

	@GetMapping("/viewAllParticipants")
	public List<Participant> getAll() {
		
	 return service.getAll();

	}

}
