package com.practice.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.hibernateDemo.enity.Laptop;
import com.practice.hibernateDemo.enity.Student;
import com.practice.hibernateDemo.enity.StudentName;

public class CreateStudent {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.setLid(100);
		laptop.setlName("HP");		
		
		Student student = new Student();
	
		
		student.setId(101);
		student.setEmail("test@gmail.com");
		student.setStudentName(new StudentName("test1","test2", "test3"));
		student.getLaptop().add(laptop);
		laptop.setStudent(student);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.getCurrentSession();

		Transaction tx = session.beginTransaction();
		
		session.save(laptop);
		session.save(student);
		
		tx.commit();
	}

}