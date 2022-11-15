package com.te.javabasics;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Student> hash = new HashSet<Student>();
		// Student1 student1 = new Student1();
		LinkedList<Student> hash1 = new LinkedList<Student>(hash);

		

		int temp = 1;
		while (temp == 1) {
			System.out.println("please Enter Student Id");
			int id = scanner.nextInt();

			System.out.println("please Enter Student Name");
			String name = scanner.next();

			System.out.println("please Enter Student Age");
			int age = scanner.nextInt();

			System.out.println("please Enter Student Marks");
			int totalMark = scanner.nextInt();

			hash.add(new Student(id, name, age, totalMark));

			System.out.println("Do you wanna continue? '1' or '0'");
			int decision = scanner.nextInt();
			if (decision == 1) {
				temp = 1;
			} else {
				temp = 0;
			}

		}

		int i = 1;

		while (i == 1) {

			System.out.println("Please Enter your choices");
			System.out.println("Sort by Student ID - Press 1 ");
			System.out.println("Sort by Student Name - Press 2");
			System.out.println("Sort by Student Age - Press 3");
			System.out.println("Sort by Student Marks - Press 4");
			int choice = scanner.nextInt();

			try {
				if (choice > 4)
					throw new InvalidInputException("Please Enter a Valid Input ");

			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());

			}

			if (choice == 1) {
				Collections.sort(hash1, new SortBySID());
				for (Student student1 : hash) {
					System.out.println(student1);

				}
			}

			if (choice == 2) {
				Collections.sort(hash1, new SortByName());
				for (Student student1 : hash) {
					System.out.println(student1);

				}
			}

			if (choice == 3) {
				Collections.sort(hash1, new SortByAge());
				for (Student student1 : hash) {
					System.out.println(student1);

				}
			}

			if (choice == 4) {
				Collections.sort(hash1, new SortByMarks());
				for (Student student1 : hash) {
					System.out.println(student1);

				}
			}

			System.out.println("If you want to see other sorting Continue 1 or 0");

			int choice2 = scanner.nextInt();
			if (choice2 == 0) {
				i = 0;
				System.out.println("thank you come Again");
				break;

			}

		}

	}

}
