package com.callor.address.service.impl;

import org.springframework.stereotype.Service;

import com.callor.address.models.UserDto;
import com.callor.address.service.UserService;

@Service
public class UserServiceImplV1 implements UserService{

	@Override
	public UserDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userLogin(UserDto userDto) {
		// TODO Auto-generated method stub
		String username = userDto.getUsername();
		String password = userDto.getPassword();
		if(!username.equalsIgnoreCase("test")) {
			return "F_USERNAME";
		} else if(!password.equals("1234")) {
			return "F_PASSWORD";
		} else {
			return "OK";
		}
	}

	@Override
	public int userJoin(UserDto userDto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
