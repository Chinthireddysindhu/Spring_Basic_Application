package com.college.student.student.beans;

public class Department 
{
	Integer strengthOfStudents;
	Integer strengthOfStaff;
	College college;
	
	
	public Department(Integer strengthOfStudents, Integer strengthOfStaff, College college) {
		super();
		this.strengthOfStudents = strengthOfStudents;
		this.strengthOfStaff = strengthOfStaff;
		this.college = college;
	}
	
	
	
	public Integer getStrengthOfStudents() {
		return strengthOfStudents;
	}



	public void setStrengthOfStudents(Integer strengthOfStudents) {
		this.strengthOfStudents = strengthOfStudents;
	}



	public Integer getStrengthOfStaff() {
		return strengthOfStaff;
	}



	public void setStrengthOfStaff(Integer strengthOfStaff) {
		this.strengthOfStaff = strengthOfStaff;
	}



	public College getCollege() {
		return college;
	}



	public void setCollege(College college) {
		this.college = college;
	}



	@Override
	public String toString() {
		return "Department [strengthOfStudents=" + strengthOfStudents + ", strengthOfStaff=" + strengthOfStaff
				+ ", college=" + college + "]";
	}



	
	
	
}
