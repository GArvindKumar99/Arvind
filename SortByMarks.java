package com.te.javabasics;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
	 public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.studentMarks-o2.studentMarks);
	}
}