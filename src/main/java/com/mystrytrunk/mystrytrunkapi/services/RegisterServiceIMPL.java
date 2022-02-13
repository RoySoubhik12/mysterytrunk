package com.mystrytrunk.mystrytrunkapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystrytrunk.mystrytrunkapi.entity.UserDetails;
import com.mystrytrunk.mystrytrunkapi.entity.UserLogin;
import com.mystrytrunk.mystrytrunkapi.repository.UserDetailsRepository;
import com.mystrytrunk.mystrytrunkapi.repository.UserLoginRepository;



@Service
public class RegisterServiceIMPL implements RegisterService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Autowired
	private UserLogin userLogin;
	@Autowired
	private UserDetails userDetails;
	
	public RegisterServiceIMPL() {
		
	}
	
	@Override
	public String register(UserDetails userDetail) {
		
		
		return "Success";
	}

	@Override
	public List<UserDetails> getUsers() {
		
		return userDetailsRepository.findAll();
	}

}
