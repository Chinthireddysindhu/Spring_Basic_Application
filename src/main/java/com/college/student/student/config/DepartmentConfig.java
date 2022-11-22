package com.college.student.student.config;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

import com.college.student.student.beans.College;
import com.college.student.student.beans.Department;

@Configuration
@ComponentScan(basePackages= {"com.college.student.student.beans", "com.college.student.student.service", "com.college.student.student.controller"})
public class DepartmentConfig 
{
	@Bean("SR")
	public College college1()
	{
		return new College("SR","Warangal");
	}
	
	@Bean("Kits")
	public College college2()
	{
		return new College("Kits","Guntur");
	}
	
	@Bean("Vasavi")
	public College college3()
	{
		return new College("Vasavi","Hyderabad");
	}
	
	@Bean("Ece")
	public Department department1()
	{
		return new Department(30,5,college1());
	}
	
	@Bean("Cse")
	public Department department2()
	{
		return new Department(25,3,college2());
	}
	
	@Bean("Civil")
	public Department department3()
	{
		return new Department(50,10,college3());
	}
	
	@Bean("Eee")
	public Department department4()
	{
		return new Department(50,10,college3());
	}
}
