package com.prac.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.prac.springboot.pojo.Student;

@Mapper
public interface StudentMapper {
	
	@Select("SELECT * FROM student")
	List<Student> findAll();

}
