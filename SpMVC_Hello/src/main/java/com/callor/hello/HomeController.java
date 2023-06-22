package com.callor.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.models.AddressDto;

@Controller
public class HomeController {	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {		
		
		model.addAttribute("name","홍길동");
		model.addAttribute("age",33);
		model.addAttribute("tel","010-1111-1111");
		
		return "home";
	}
	
	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		
		AddressDto addrDto = new AddressDto();
		addrDto.setName("성춘향");
		addrDto.setTel("010-222-2222");
		addrDto.setAge(16);
		addrDto.setAddress("전라북도 남원시");
		
		model.addAttribute("ADDR", addrDto);
		
		// WEB-INF/views/hello.jsp 를 찾아서 rendering 해 달라
		return "hello";
	}
	
	@RequestMapping(value = "/user")
	public String user(Model model) {
		List<AddressDto> addrList = new ArrayList<AddressDto>();
		AddressDto addrDto = new AddressDto();
		addrDto.setName("성춘향");
		addrDto.setTel("010-111-1111");
		addrDto.setAge(16);
		addrDto.setAddress("전라북도 남원시");
		addrList.add(addrDto);
		
		addrDto = new AddressDto();
		addrDto.setName("홍길동");
		addrDto.setTel("010-222-2222");
		addrDto.setAge(30);
		addrDto.setAddress("광주광역시");
		addrList.add(addrDto);
		
		addrDto = new AddressDto();
		addrDto.setName("이몽룡");
		addrDto.setTel("010-333-3333");
		addrDto.setAge(18);
		addrDto.setAddress("서울특별시");
		addrList.add(addrDto);
		
		for(AddressDto dto: addrList) {
			System.out.println(dto.toString());
		}
		model.addAttribute("ADDRS", addrList);
		return "user2";
	}
}
