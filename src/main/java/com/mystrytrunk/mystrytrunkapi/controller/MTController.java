package com.mystrytrunk.mystrytrunkapi.controller;


import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystrytrunk.mystrytrunkapi.entity.UserDetails;
import com.mystrytrunk.mystrytrunkapi.entity.UserLogin;
import com.mystrytrunk.mystrytrunkapi.services.RegisterService;

@RestController
public class MTController {
	
	@Autowired
	private RegisterService registerService;

	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserDetails userDetails) throws JsonProcessingException {
		
		return registerService.register(userDetails);
	}
	
	@GetMapping("/users")
	public List<UserDetails> getUsers(){
		return registerService.getUsers();
	}

}
