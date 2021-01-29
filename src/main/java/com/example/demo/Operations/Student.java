package com.example.demo.Operations;

import java.time.LocalDate;

public class Student {
	private String name;
	private String rollNo;
	private LocalDate DOB;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollNo;
	}
	public void setRollno(String rollno) {
		this.rollNo = rollno;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	
    @Override
    public String toString() { 
        return String.format("name "+name + "rollNo. " + rollNo+" DOB "+DOB); 
    } 

}
