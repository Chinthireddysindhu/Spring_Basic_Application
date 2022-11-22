package com.college.student.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.student.student.beans.Department;
import com.college.student.student.service.StudentService;

@RestController
public class StudentController 
{
	StudentService service;

	public StudentService getService() {
		return service;
	}
	
	@Autowired
	public void setService(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/SR")
	public List<Department> getSR()
	{
		return service.getSRDepartment();
		
	}

}
