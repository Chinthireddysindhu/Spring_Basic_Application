package com.college.student.student.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class DepartmentRepo 
{
	Department ece;
	Department cse;
	Department civil;
	Department eee;
	
	public Department getEce() {
		return ece;
	}
	
	@Autowired
	@Qualifier("Ece")
	public void setEce(Department ece) {
		this.ece = ece;
	}
	public Department getCse() {
		return cse;
	}
	
	@Autowired
	@Qualifier("Cse")
	public void setCse(Department cse) {
		this.cse = cse;
	}
	public Department getCivil() {
		return civil;
	}
	
	@Autowired
	@Qualifier("Civil")
	public void setCivil(Department civil) {
		this.civil = civil;
	}
	public Department getEee() {
		return eee;
	}
	
	@Autowired
	@Qualifier("Eee")
	public void setEee(Department eee) {
		this.eee = eee;
	}
	
	
	@Override
	public String toString() {
		return "DepartmentRepo [ece=" + ece + ", cse=" + cse + ", civil=" + civil + ", eee=" + eee + "]";
	}
	
}
