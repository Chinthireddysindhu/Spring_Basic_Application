package com.college.student.student.beans;

public class College
{
	String name;
	String place;
	public College(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", place=" + place + ", getName()=" + getName() + ", getPlace()=" + getPlace()
				+ "]";
	}
	
	
	
}
