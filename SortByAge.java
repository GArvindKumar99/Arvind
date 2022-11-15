package com.te.javabasics;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentAge-o2.studentAge;
	}
	

}