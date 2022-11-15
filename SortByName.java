package com.te.javabasics;

import java.util.Comparator;

public class SortByName implements Comparator<Student>  {
	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentName.compareTo(o2.studentName);
	}

}