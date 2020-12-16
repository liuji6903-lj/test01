package com.prac.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerYml3 {
	
	@Autowired
	private StudentProperties studentProperties;
	
	@Value("${content}")
	private String content;
	
	@RequestMapping("/hello3")
	public String hello3() {
		return studentProperties.getName()+","+studentProperties.getAge()+","+content;
	}

}
