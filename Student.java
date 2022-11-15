package com.te.javabasics;

import java.util.Objects;

public class Student implements Comparable<Student> {

	int studentId;
	String studentName;
	int studentAge;
	double studentMarks;

	public Student(int studentId, String studentName, int studentAge, double studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentName.compareTo(o.studentName);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [studentId=" + studentId + ",studentName=" + studentName + ",studentAge=" + studentAge
				+ ",studentMarks=" + studentMarks + "]";
	}

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Double d1 = o1.studentMarks;
		Double d2 = o2.studentMarks;

		return d1.compareTo(d2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		if (studentId == other.studentId) {
			try {
				throw new InvalidInputException("Enter a valid input");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		}

		return true;
	}

}
