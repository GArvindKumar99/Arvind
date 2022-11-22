package com.te.mavendemo.pojo;





	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {
		public static void main(String[] args) {
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowiring.xml");
			Student bean = (Student)applicationContext.getBean("s");
			
			
			System.out.println(bean);
			System.out.println();
			
			
		}

	}