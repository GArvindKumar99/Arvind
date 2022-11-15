package com.te.javabasics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashDuplicate {

	static HashSet<Student> obj;
	static String b;
	static String ch;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int temp = 1;

		while (temp == 1) {
			System.out.println("Please Enter Student Id");
			int id = scanner.nextInt();
			System.out.println("Please Enter Student Name");
			String name = scanner.next();
			System.out.println("Please Enter Student Age");
			int age = scanner.nextInt();
			System.out.println("lease Enter Student Marks");
			int totalMark = scanner.nextInt();
			obj = new HashSet<Student>();
			obj.add(new Student(id, name, age, totalMark));
			System.out.println("Do you wanna continue? '1' or '0'");
			int decision = scanner.nextInt();
			if (decision == 1) {
				temp = 1;
			} else {
				temp = 0;
			}

		}

		System.out.println("Before sorting");
		for (Student student : obj) {
			System.out.println(obj);
		}

//			for (Student student : obj) {
//				System.out.println(student);
//
//			}

//			 Student student = new Student(20, "Arvind", 25, 100);
//				Student student1 = new Student(10, "Roshan", 50, 95);
//				Student student2 = new Student(50, "Rajieve", 40, 65);
//				Student student3 = new Student(40, "Kalavathi", 27, 40);
//				Student student4 = new Student(30, "Preethi", 24, 98);
//				Student student5 = new Student(20, "Shyamu", 25, 100);
//				Student student6 = new Student(10, "Ravitej", 50, 95);
//				Student student7 = new Student(50, "Raj", 40, 65);//HashSet is not accepting this duplicate id
//				Student student8 = new Student(40, "Kala", 27, 40);
//				Student student9 = new Student(30, "Prathi", 24, 98);
//			     obj=new HashSet<Student>();
//				obj.add(student);
//				obj.add(student1);
//				obj.add(student2);
//				obj.add(student3);
//				obj.add(student4); 
//			    obj.add(student5);
//			    obj.add(student6);
//			    obj.add(student7);
//			    obj.add(student8);
//			    obj.add(student9);
//			System.out.println("Before sorting");
//	       for(Student std:obj) {
//	    	   System.out.println(std);
//	       }

		do {
			System.out.println("If you want sorting enter yes otherwise enter no");
			b = scanner.next();
			ch = "yes";
			if (ch.equalsIgnoreCase(b)) {
				disp();
			} else {
				System.out.println("Thank you");
			}
		} while (ch.equalsIgnoreCase(b));

	}

	public static void disp() {
		System.out.println("1.sorting by id");
		System.out.println("2.sorting by name");
		System.out.println("3.sorting by age");
		System.out.println("4.sorting by marks");
		System.out.println("Enter any 1 number from 1 to 4");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
//	       Collections.sort(obj, new Studentid());
			System.out.println("*****after sorting by student id******");
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		case 2:
//	       Collections.sort(obj, new Studentname());
			System.out.println("*****after sorting by student name****");
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		case 3:
//	       Collections.sort(obj, new Studentage());
			System.out.println("*****after sorting by student age****");
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		case 4:
//	       Collections.sort(obj, new Studentmark());
			System.out.println("*****after sorting by student mark****");
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		default:
			System.out.println("Invalid number");
		}
	}

}
