package com.webapp.TalentJet.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.Users;
import com.webapp.TalentJet.services.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/CreateUser")
	public Users createUser(@RequestBody Users users) {
		
		return userService.createUser(users);
	}
	
	@GetMapping("/getUserById")
	public Optional<Users> getUserById(@RequestParam("Id") Long userId){
		return userService.getUserById(userId);
	}
	
	@GetMapping("/getAll")
	public List<Users> getAllUsersList(){
		
		return userService.getAllUsersList();
	}
	
	@PostMapping("/UpdateUser")
	public Users updateUser(@RequestBody Users users) {
		
		return userService.updateUser(users);
	}
	
	@DeleteMapping("/deleteUser{id}")
	public void deleteUser(@PathParam("id") long users) {
		userService.deleteUser(users);
	}

}
