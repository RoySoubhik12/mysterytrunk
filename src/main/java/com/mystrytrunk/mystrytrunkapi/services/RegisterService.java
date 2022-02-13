package com.mystrytrunk.mystrytrunkapi.services;

import java.util.List;

import com.mystrytrunk.mystrytrunkapi.entity.UserDetails;

public interface RegisterService {

	public String register(UserDetails userDetails);

	public List<UserDetails> getUsers();
}
