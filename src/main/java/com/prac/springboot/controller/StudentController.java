package com.prac.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prac.springboot.mapper.StudentMapper;
import com.prac.springboot.pojo.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/listStudent")
	public String listStudent(Model m) {
		List<Student> students = studentMapper.findAll();
		m.addAttribute("students",students);
		return "listStudent";
	}
	
}
