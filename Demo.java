package com.te.mavendemo.pojo;

import lombok.Data;

@Data
public class Demo {
	private int a;
	private int b;
	public Demo(int a, int b) {
		System.out.println("Int");
		this.a = a;
		this.b = b;
	}
	public Demo(double a,double b) {
		System.out.println("double");
		this.a=(int)a;
		this.b=(int)b;
		
	}

}
