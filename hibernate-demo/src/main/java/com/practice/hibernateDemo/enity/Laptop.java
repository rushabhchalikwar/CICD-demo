package com.practice.hibernateDemo.enity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lName;
	
	@ManyToOne
	@JoinColumn(name="student_id", referencedColumnName="id")
	private Student student;
	
	public Laptop() {
	}

	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + lid + ", lName=" + lName + "]";
	}
}
