package com.callor.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public List<String> selectAll();
	public String findByName(String name);
	
}
