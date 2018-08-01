package com.faruk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faruk.domain.User;
import com.faruk.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@PostMapping(value="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping(value="/users/{id}")
	public void addUser(@RequestBody User user, @PathVariable String id) {
		userService.updateUser(id,user);
	}
	
	@DeleteMapping(value="/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}
	
	
}
