package com.college.student.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.student.student.beans.Department;
import com.college.student.student.beans.DepartmentRepo;

@Service
public class StudentService 
{
	@Autowired
	DepartmentRepo departmentRepo;
	
	public List<Department> getSRDepartment()
	{
		ArrayList<Department> departments = new ArrayList<>();
		departments.add(departmentRepo.getEce());
		return departments;
	}
}
