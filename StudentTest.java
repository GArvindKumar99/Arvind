package com.te.mavendemo.pojo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		Student bean = (Student)applicationContext.getBean("s");
		
		
		System.out.println(bean);
		
		
	}

}
