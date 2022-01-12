package com.practice.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.practice.hibernateDemo.enity.Instructor;
import com.practice.hibernateDemo.enity.InstructorDetail;

public class OneToOneMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).
				buildSessionFactory();  

		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		InstructorDetail instructorDetail = new InstructorDetail("youtube.com", "coding");
		Instructor instructor = new Instructor("Rushabh", "Chalikwar", "rushabhchalikwar@gmail.com");
		instructor.setInstructorDetail(instructorDetail);
		
		session.save(instructor);
		
		session.getTransaction().commit();

	}

}
