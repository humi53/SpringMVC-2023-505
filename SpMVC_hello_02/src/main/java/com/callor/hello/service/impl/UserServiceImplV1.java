package com.callor.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.hello.models.UserDto;
import com.callor.hello.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {

	/*
	 * List<UserDto> userList 객체를 생성하고
	 * 임의로 3명의 User 정보를 add 하기
	 * UserList 를 return 하기
	 */
	public UserServiceImplV1() {
		
	}
	
	@Override
	public List<UserDto> selectAll() {
		List<UserDto> userList = new ArrayList<UserDto>();
		userList.add(new UserDto("asdf", "asdf", "아스드프", "010-1111-1111", "미국", 100));
		userList.add(new UserDto("hong1", "1234", "홍길동", "010-2222-2222", "서울", 30));
		userList.add(new UserDto("mung1", "1234", "이몽룡", "010-3333-3333", "전라도", 18));
		
		UserDto dto = new UserDto();
		dto.setUsername("asdf");
		dto.setPassword("12345");
		dto.setName("이스드프박사");
		dto.setTel("010-1111-1111");
		dto.setAddr("미국");
		dto.setAge(33);
		userList.add(dto);
		
		
		return userList;
	}

	@Override
	public UserDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int input(UserDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
