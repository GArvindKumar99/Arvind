package com.te.mavendemo.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hybrid.xml");
	Student bean = (Student)applicationContext.getBean("s");
	System.out.println(bean);
	
	}
	
	
	

}
