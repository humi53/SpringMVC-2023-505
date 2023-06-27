package com.callor.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.service.UserService;

/*
 * Client 의 요청을 제일먼저 수신하여 처리하는 클래스
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	/*
	 * Spring project 에서는 Service 객체를 생성할때
	 * Service 클래스의 생성자를 사용하지 않는다
	 * Service 클래스에 @Service Annotation 을 부착하고
	 * 사용할 Service 객체에 @Autowired Annotation 을 부착한다
	 */
	@Autowired
	protected UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		List<String> strList = userService.selectAll();
		return strList.get(0);
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return null;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Model model) {
		return null;
	}
}
