package com.te.mavendemo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.Value;

@Data

public class Student {
	
    @org.springframework.beans.factory.annotation.Value("100")
	private int studentId;
	
	@org.springframework.beans.factory.annotation.Value("arv")
	private String studentName;
	
	
	
	@Autowired
	@Qualifier("f")
	private Address address; //d.i



	
	//private Address address1; //d.i

	
}
