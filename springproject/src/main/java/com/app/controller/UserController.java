package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Users;
import com.app.pojos.userLogin;
import com.app.service.IUserService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController //cla s level annotation +@Responce Body anno added on types of all req handling methods
@RequestMapping("/users")
public class UserController {
	private List<Users> users;

	
	  @Autowired 
	  private IUserService service;
	  
	  public UserController() {
	  System.out.println("In USer Controlller"+getClass().getName()); }
	  
	  @GetMapping 
	  public ResponseEntity<?> listAllUsers() {
	  System.out.println("in list of all users");
	  List<Users> users=service.getAllUsers(); 
	  if(users.isEmpty()) 
		  return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	  return new ResponseEntity<>(users,HttpStatus.OK); }	 
	  
	  @GetMapping(produces = "application/json")
		@RequestMapping({ "/validateLogin" })
		public userLogin validateLogin() {
			return new userLogin("User successfully authenticated");
		}
	  @PostMapping(produces = "application/json")
		public Users create(@RequestBody Users userdemo) {
			users.add(userdemo);
			System.out.println(userdemo);
			return userdemo;
		}


}
