package com.practice.hibernateDemo;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernateDemo.enity.Course;
import com.practice.hibernateDemo.enity.Instructor;
import com.practice.hibernateDemo.enity.InstructorDetail;

public class OneToManyMapping {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		String str = "5aj45kkn5";
  
		int left = 0;
		int right = 0;
		String cal = "";

		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				left = right;
				continue;
			} 
			
			left = i;
			cal += str.charAt(i);
			
		}
		System.out.println(cal);

	}

}