package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Doctors;
import com.app.service.IDoctorService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private IDoctorService service;
	
	public DoctorController() {
		System.out.println("In Doctor Controller"+getClass().getName());
	}
	
	@GetMapping
	public ResponseEntity<?>listAllDoctors()
	{
		
		  System.out.println("in list of all doctors");
		  
		  List<Doctors>doctors=service.listAllDoctors();
		  if(doctors.isEmpty())
		  
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			  return new ResponseEntity<>(doctors,HttpStatus.OK);
		  
	}
	
}
