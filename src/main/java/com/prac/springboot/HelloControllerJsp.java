package com.prac.springboot;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerJsp {
	
	@RequestMapping("/hello4")
	public String hello(Model m) {
		m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
		return "hello";
	}

}
