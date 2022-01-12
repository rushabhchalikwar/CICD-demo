package com.practice.hibernateDemo.enity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id	
	private int id;
	private StudentName studentName;
	private String email;
	
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptops = new ArrayList<Laptop>();
	
	public Student() {
	}


	public Student(int id, StudentName studentName, String email) {
		this.id = id;
		this.studentName = studentName;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public StudentName getStudentName() {
		return studentName;
	}


	public void setStudentName(StudentName studentName) {
		this.studentName = studentName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public List<Laptop> getLaptop() {
		return laptops;
	}


	public void setLaptop(List<Laptop> laptops) {
		this.laptops = laptops;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", email=" + email + "]";
	}	
}
