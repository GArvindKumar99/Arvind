
package com.te.javabasics;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupSort {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(4, "Raghav", 23, 67));
		arrayList.add(new Student(1, "Rohit", 23, 67));
		arrayList.add(new Student(10, "Nilim", 23, 67));
		arrayList.add(new Student(2, "Sateesh", 23, 67));

		System.out.println("Before sorting--->" + arrayList);

		Comparator<Student> sortById = (Student a, Student b) -> {
			return a.studentId - b.studentId;
		};

		Comparator<Student> sortByName = (Student a, Student b) -> {
			return a.studentName.compareTo(b.studentName);
		};

		Comparator<Student> sortByAge = (Student a, Student b) -> {
			return a.studentAge - b.studentAge;
		};

		Comparator<Student> sortByMark = (Student a, Student b) -> {
			return (int) (a.studentMarks - b.studentMarks);
		};

//		Collections.sort(arrayList, sortById);
		//System.out.println("arrayList");
		
		//List<Student> collect2 = arrayList.stream().sorted(sortById).collect(Collectors.toList());
		//System.out.println(collect2);
		
		
		
		
		arrayList.stream().sorted(sortById).collect(Collectors.toList()).forEach(System.out::println);
		
		

		Predicate<Student> predicate = (a) ->{
			return a.getStudentName().startsWith("R") && a.getStudentName().endsWith("t");
		};
		
		
		List<Student> collect = arrayList.stream().filter(predicate).collect(Collectors.toList());
		System.out.println("------------------------");
		for (Student student : collect) {
			System.out.println(student);
		}
	}

}