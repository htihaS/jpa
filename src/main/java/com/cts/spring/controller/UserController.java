package com.cts.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.spring.model.UserDetails;
import com.cts.spring.model.Users;
import com.cts.spring.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//Display all users
	@RequestMapping("/")
	public List<UserDetails> getAllUser()
	{
		return userService.getAllUsers();
		
	}
	
	//retrieve a particular user by id
	@RequestMapping("/user/{id}")
	public UserDetails getUserById(@PathVariable("id") int id )
	{
		return userService.getUserById(id);
		
	}
	
	//delete a particular user by id
	@RequestMapping("/deleteuser/{id}")
	public void deleteUserById(@PathVariable("id") int id)
	{
		 userService.delete(id);
	}
	
	//Insert a user
	@PostMapping("/add")
	public void addUser(@RequestBody UserDetails userDetails)
	{
		
		userService.addUser(userDetails);
	}
	
	//update a user
	@PutMapping("/update")
	public void updateUser(@RequestBody UserDetails userDetails)
	{
		userService.updateUser(userDetails);
	}
	
	@PostMapping("/addmul")
	public void addMultipleUsers(@RequestBody List<UserDetails> userDetails)
	{
		userService.addMultipleUser(userDetails);
	}
	/////////////////////////////////////////////////////////////////
	//JPA Mapping one to one
	
	@PostMapping("/adduser")
	public void addUsers(@RequestBody Users users)
	{
		
		userService.addUsers(users);
	}
	
	
}
